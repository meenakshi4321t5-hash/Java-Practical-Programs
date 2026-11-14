/*
Q33. Given an integer array, print its unique
elements using a HashSet.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 1, 2, 8};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }
}

/*
OUTPUT (order may vary):
[1, 2, 5, 8]
*/
