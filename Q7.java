/*
Q7. Create Person, Employee, and Manager classes using multilevel inheritance.
Display all details using printAllDetails().
*/

class Person {
    String name;
    int age;

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int empId;

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    String department;

    void printAllDetails() {
        displayPersonDetails();
        displayEmployeeDetails();
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Rahul";
        m.age = 30;
        m.empId = 101;
        m.department = "IT";

        m.printAllDetails();
    }
}

/*
OUTPUT:
Name: Rahul
Age: 30
Employee ID: 101
Department: IT
*/
