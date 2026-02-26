package Map.DeleteSurnames;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Person, Integer> map = new TreeMap<>();
        String buffer = scan.nextLine();
        while (!"end".equals(buffer)) {
            String[] parts = buffer.split(" +");
            if (parts.length > 0) {
                String surname = parts[0];
                String name = parts[1];
                Person person = new Person(surname, name);
                if (map.containsKey(person)) {
                    map.put(person, map.get(person) + 1);
                } else {
                    map.put(person, 1);
                }
            }
            buffer = scan.nextLine();
        }
        ArrayList<Map.Entry<Person, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Person, Integer>>() {
            @Override
            public int compare(Map.Entry<Person, Integer> o1, Map.Entry<Person, Integer> o2) {
                return o1.getValue();
            }
        });

        for (Map.Entry<Person, Integer> entry : list) {
            if  (entry.getValue() <2){
                System.out.println(entry.getKey());
            }
        }
    }
}
