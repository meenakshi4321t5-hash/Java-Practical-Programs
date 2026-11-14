/*
Q9. Create a Member class with name, age, and salary.
Extend it into Employee and Manager.
Override printDetails() and call parent method using super.
*/

class Member {
    String name;
    int age;
    double salary;

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    String department;

    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Priya";
        e.age = 25;
        e.salary = 30000;
        e.specialization = "Java";

        e.printDetails();

        Manager m = new Manager();
        m.name = "Amit";
        m.age = 35;
        m.salary = 60000;
        m.department = "IT";

        m.printDetails();
    }
}

/*
OUTPUT:
Name: Priya
Age: 25
Salary: 30000.0
Specialization: Java
Name: Amit
Age: 35
Salary: 60000.0
Department: IT
*/
