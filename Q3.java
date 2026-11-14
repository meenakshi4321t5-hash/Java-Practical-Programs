/*
Q3. Create a BankAccount class with private balance.
Use a setter to reject negative balances and a getter to display balance.
*/

class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setBalance(5000);
        System.out.println(b.getBalance());

        b.setBalance(-1000);
        System.out.println(b.getBalance());
    }
}

/*
OUTPUT:
5000.0
Invalid balance
5000.0
*/
