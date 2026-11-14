/*
Q2. Add a private salary variable to Employee class.
If salary is negative, print an error and set default salary to 15000.0.
*/

class Employee {
    private int empId;
    private String name;
    private String department;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Error: Invalid salary");
            this.salary = 15000.0;
        } else {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmpId(101);
        e.setName("Rahul");
        e.setDepartment("IT");

        e.setSalary(25000.0);
        System.out.println("Salary: " + e.getSalary());

        e.setSalary(-5000.0);
        System.out.println("Salary: " + e.getSalary());
    }
}

/*
OUTPUT:
Salary: 25000.0
Error: Invalid salary
Salary: 15000.0
*/
