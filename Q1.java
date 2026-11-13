Q1.Create an Employee class with private variables empId, name, and department. 
   Add getters and setters using this keyword. Print the details using getters.

CODE :
class Employee {
    private int empId;
    private String name;
    private String department;

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
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmpId(101);
        e.setName("Rahul");
        e.setDepartment("IT");

        System.out.println(e.getEmpId());
        System.out.println(e.getName());
        System.out.println(e.getDepartment());
    }
}


OUTPUT : 101
         Rahul
         IT
