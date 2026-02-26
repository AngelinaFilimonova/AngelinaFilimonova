package Set;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class vocabularySet {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        TreeSet<String> surnames = new TreeSet<>();
        try{
            while ((!"end".equals(input = br.readLine()))) {
                try {
                    String[] parts = input.replaceAll("[^a-zA-Zа-яА-Я]", " ").split(" +");
                    for(String item : parts){
                        surnames.add(item);
                    }
                } catch (NumberFormatException e) {
                }
            }
        }catch(Exception e){
        }
        if (surnames.isEmpty()) {
            System.out.print("Set is empty");
        }else{
            Iterator<String> iterator = surnames.descendingIterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
