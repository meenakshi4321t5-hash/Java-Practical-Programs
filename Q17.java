/*
Q17. Create an abstract class Shape with an abstract
method area(). Calculate the area of a circle.
*/

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println(3.14 * 5 * 5);
    }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
    }
}

/*
OUTPUT:
78.5
*/
