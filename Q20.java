/*
Q20. Create an interface Vehicle with a method start().
Implement it in Car and Bike classes.
*/

interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();
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
