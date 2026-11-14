/*
Q31. Insert 10, 20, 10, 30, 20, and 40 into a
HashSet and print the unique values.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);

        System.out.println(set);
    }
}

/*
OUTPUT (order may vary):
[10, 20, 30, 40]
*/
