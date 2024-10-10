import com.sun.tools.jconsole.JConsoleContext;

import java.util.AbstractCollection;
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
    }
}