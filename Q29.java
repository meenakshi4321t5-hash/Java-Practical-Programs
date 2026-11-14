/*
Q29. Given a string, count how many times each
character appears using a HashMap.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "programming";

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        System.out.println(freq);
    }
}

/*
OUTPUT (order may vary):
{p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
*/
