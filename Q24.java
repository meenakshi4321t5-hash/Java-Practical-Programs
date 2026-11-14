/*
Q24. Given an ArrayList of integers, remove all
negative numbers and print the remaining list.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list =
            new ArrayList<>(Arrays.asList(4, -2, 7, -9, 0, 3));

        list.removeIf(num -> num < 0);

        System.out.println(list);
    }
}

/*
OUTPUT:
[4, 7, 0, 3]
*/
