/*
Q4. Create a Student class with private name and marks.
Accept marks only between 0 and 100.
*/

class Student {
    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Priya");
        s.setMarks(85);

        System.out.println(s.getName());
        System.out.println(s.getMarks());

        s.setMarks(120);
    }
}

/*
OUTPUT:
Priya
85
Invalid marks
*/
