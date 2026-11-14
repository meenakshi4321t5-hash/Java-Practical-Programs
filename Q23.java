/*
Q23. Given an ArrayList and a target value, check
whether the target exists and print its index.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list =
            new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        int target = 30;
        int index = list.indexOf(target);

        if (index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
    }
}

/*
OUTPUT:
Found at index 2
*/
