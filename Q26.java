/*
Q26. Create a HashMap containing three student names
and their marks. Display each key-value pair.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Aman", 85);
        marks.put("Riya", 92);
        marks.put("Karan", 78);

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

/*
OUTPUT (one possible order):
Aman : 85
Riya : 92
Karan : 78
*/
