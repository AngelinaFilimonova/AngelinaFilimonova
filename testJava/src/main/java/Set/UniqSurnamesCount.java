package Set;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class UniqSurnamesCount {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int count = 0;
        Set<String> surnames = new HashSet<>();
        try{
            while ((!"end".equals(input = br.readLine()))) {
                try {
                    String[] parts = input.split(" ");
                    surnames.add(parts[0]);
                } catch (NumberFormatException e) {
                }
            }
        }catch(Exception e){
        }
        if (surnames.isEmpty()) {
            System.out.print("Set is empty");
        }else{
            count = surnames.size();
            System.out.println(count);
        }
    }
}
