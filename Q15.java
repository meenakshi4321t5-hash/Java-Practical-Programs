/*
Q15. Create a Vehicle class with a start() method.
Override it in Car and Bike classes to display
their starting messages.
*/

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();
    }
}

/*
OUTPUT:
Car starts
Bike starts
*/
