/*
Q13. Create a base class Animal and subclasses Dog,
Cat, and Cow. Override the makeSound() method to
display their respective sounds.
*/

class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    void makeSound() {
        System.out.println("Moo");
    }
}

class Main {
    public static void main(String[] args) {
        Animal[] a = {new Dog(), new Cat(), new Cow()};

        for (Animal obj : a) {
            obj.makeSound();
        }
    }
}

/*
OUTPUT:
Bark
Meow
Moo
*/
