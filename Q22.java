/*
Q22. Given an ArrayList of integers, calculate and
print the sum of its elements.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list =
            new ArrayList<>(Arrays.asList(4, 7, 2, 9, 3));

        int sum = 0;

        for (int num : list) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}

/*
OUTPUT:
Sum = 25
*/
