/*
Q8. Create a Shape parent class with color.
Extend it into Circle and Rectangle.
Use super(color) and calculate their areas.
*/

class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    void area() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + (length * width));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5);
        Rectangle r = new Rectangle("Blue", 4, 6);

        c.area();
        r.area();
    }
}

/*
OUTPUT:
Color: Red
Area: 78.5
Color: Blue
Area: 24.0
*/
