package Map.wordsCount;

import Map.Salary.SurnameAndSalary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        Map<String, Integer> map = new HashMap<>();

        while ((!"end".equals(input = br.readLine()))) {
            String[] parts = input.replaceAll("[^a-zA-Zа-яА-Я]", " ").split(" +");
            for (String word : parts) {
                int number = 1;
                if (map.containsKey(word)) {
                    number += map.get(word);
                }
                map.put(word, number);
            }
        }

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue() - o2.getValue();
            }
        });
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
        }
    }
}
