import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    public Account() {
        this.dateCreated = new Date();
    };
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance && amount > 0) {
            this.balance-=amount;
            System.out.println("Снятие произведение успешно.");
        } else {
            System.out.println("На балансе недостаточно средств.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance+=amount;
            System.out.println("Пополнение прошло успешно.");
        } else {
            System.out.println("Сумма пополнения не может быть отрицательной.");
        }
    }

    public double getMonthlyIntereset() {
        return this.balance * (this.annualInterestRate / 100 / 12);
    }
}