/*
Q18. Create an abstract class Bank with an abstract
method getRate(). Implement it in SBI.
*/

abstract class Bank {
    abstract void getRate();
}

class SBI extends Bank {
    void getRate() {
        System.out.println("Interest Rate: 7%");
    }
}

class Main {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.getRate();
    }
}

/*
OUTPUT:
Interest Rate: 7%
*/
