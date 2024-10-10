import java.util.Date;

public class Transaction {
    private Date dateCreated;
    private char type;
    private double amount;
    private double balance;
    private String description;
    public Transaction(char type, double amount, double balance, String description) {
        this.amount = amount;
        this.dateCreated = new Date();
        this.balance = balance;
        this.type = type;
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setType(char type) {
        this.type = type;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public char getType() {
        return this.type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }


}
