/*
Q21. Create an ArrayList of integers, insert 5 numbers,
and print all elements.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}

/*
OUTPUT:
10 20 30 40 50
*/
