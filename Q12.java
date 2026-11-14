/*
Q12. Create an AreaCalculator class with overloaded
calculateArea() methods to calculate the area of
a square, rectangle, and circle.
*/

class AreaCalculator {
    double calculateArea(double side) {
        return side * side;
    }

    double calculateArea(double l, double w) {
        return l * w;
    }

    double calculateArea(double r, String shape) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        System.out.println(obj.calculateArea(5));
        System.out.println(obj.calculateArea(4, 6));
        System.out.println(obj.calculateArea(3, "Circle"));
    }
}

/*
OUTPUT:
25.0
24.0
28.26
*/
