package Set.SystemOfRegistration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        TreeSet<String> name = new TreeSet<>();
        try{
            while ((!"end".equals(input = br.readLine()))) {
                if (input == null || input.trim().isEmpty()) {
                    continue;
                }
                if (!name.contains(input)) {
                    name.add(input);
                    System.out.println("ОК");
                } else {
                    int i = 1;
                    String newName;
                    do {
                        newName = input + i;
                        i++;
                    } while (name.contains(newName));
                    name.add(newName);
                    System.out.println(newName);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
