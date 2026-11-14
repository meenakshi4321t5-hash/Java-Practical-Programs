/*
Q1. Create a MathOperations class with overloaded
multiply() methods to multiply two integers,
three integers, and two double values.
*/

class MathOperations {
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println(obj.multiply(2, 3));
        System.out.println(obj.multiply(2, 3, 4));
        System.out.println(obj.multiply(2.5, 3.5));
    }
}

/*
OUTPUT:
6
24
8.75
*/
