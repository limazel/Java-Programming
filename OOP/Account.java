public class Account {
    private int number;
    private double balance;

    public Account(int number){
        this.number = number;
        this.balance = 0.0;
    }

    public Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public int getNumber() {
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public String toString() {
        return String.format("Account[number=%d, balance=%.2f]", number, balance);
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (balance >= amount) {
           balance -= amount;
        } else {
           System.out.println("amount exceeded");
        }
     }

     public void transferTo(double amount, Account another) {
        if (balance >= amount) {
           this.balance -= amount;
           another.balance += amount;
        } else {
           System.out.println("amount exceeded");
        }
     }
}
