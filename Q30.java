/*
Q30. Given a HashMap of employee names and IDs,
print all names whose ID matches a target ID.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> employees = new HashMap<>();

        employees.put("Asha", 101);
        employees.put("Dev", 102);
        employees.put("Mira", 101);

        int targetId = 101;

        for (Map.Entry<String, Integer> entry : employees.entrySet()) {
            if (entry.getValue() == targetId) {
                System.out.println(entry.getKey());
            }
        }
    }
}

/*
OUTPUT (order may vary):
Asha
Mira
*/
