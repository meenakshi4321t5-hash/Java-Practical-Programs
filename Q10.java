/*
Q10. Create a Person class with a parameterized constructor.
Extend it into Student and use super(name) to initialize
the parent's variable.
*/

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Neha", 12);
        s.display();
    }
}

/*
OUTPUT:
Name: Neha
Roll No: 12
*/
