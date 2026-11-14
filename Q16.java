/*
Q16. Create an abstract class Animal with an abstract
method sound(). Implement it in a Dog class.
*/

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

/*
OUTPUT:
Dog barks
*/
