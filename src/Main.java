import com.sun.tools.jconsole.JConsoleContext;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account = new Account(1155, 300000);
        account.setAnnualInterestRate(6.5);
        System.out.println("Ежемесячные проценты: "+account.getMonthlyIntereset());
        System.out.println("Дата создания аккаунта: "+account.getDateCreated());
        System.out.println("Баланс аккаунта до снятия: " + account.getBalance());
        account.withdraw(16500);
        System.out.println("Баланс после снятия: " + account.getBalance());
        account.deposit(50000);
        System.out.println("Баланс после пополнения: " + account.getBalance());

        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 10000);
        }

        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.printf("\nВведите ID: ");
            int id = scanner.nextInt();
            if (id >= 0 && id < 10) {
                do {
                    Account selectAccount = accounts[id];
                    System.out.println("\nВыберите действие:");
                    System.out.println("1. Проверить баланс счета");
                    System.out.println("2. Снять со счета");
                    System.out.println("3. Положить на счет");
                    System.out.println("4. Выйти");
                    System.out.printf("Введите пункт меню: \n");
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("\nБаланс счета: "+selectAccount.getBalance());
                            break;
                        case 2:
                            System.out.printf("\nВведите сумму для снятия: ");
                            double amountForWithdraw = scanner.nextDouble();
                            selectAccount.withdraw(amountForWithdraw);
                            break;
                        case 3:
                            System.out.printf("\nВведите сумму для поплнения: ");
                            double amountForDeposit = scanner.nextDouble();
                            selectAccount.withdraw(amountForDeposit);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("\nНеверный выбор. Пожалуйста, попробуйте снова.");

                    }
                } while (choice != 4);
            } else {
                System.out.println("\nНеверный выбор ID. Пожалуйста, попробуйте снова");
            }
        }

    }
}