/*
Q14. Create a base class Payment and subclasses
CreditCardPayment and UPIPayment. Override the
processPayment() method to display payment details.
*/

class Payment {
    void processPayment(double amount) {
        System.out.println("Processing payment: " + amount);
    }
}

class CreditCardPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("Credit Card Payment: " + amount);
        System.out.println("2% fee charged");
    }
}

class UPIPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("UPI Payment: " + amount);
        System.out.println("No extra fees");
    }
}

class Main {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.processPayment(1000);

        p = new UPIPayment();
        p.processPayment(500);
    }
}

/*
OUTPUT:
Credit Card Payment: 1000.0
2% fee charged
UPI Payment: 500.0
No extra fees
*/
