/*
Q35. Given two arrays, print the distinct elements
common to both arrays using HashSet.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 4, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int num : a)
            set.add(num);

        HashSet<Integer> result = new HashSet<>();

        for (int num : b) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        System.out.println(result);
    }
}

/*
OUTPUT (order may vary):
[2, 4]
*/
