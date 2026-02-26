package ArrayList.IntegerVaribles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int elem;
        List<Integer> values = new ArrayList<>();
        try{
            while (!"end".equals(input = br.readLine())) {
                try {
                    values.add(Integer.parseInt(input));
                } catch (NumberFormatException e) {
                }
            }
        }catch(Exception e){
        }
        if (values.isEmpty()) {
            System.out.print("List is empty");
        }else{
            elem = values.size() / 2;
            int sum = values.get(0) + values.get(values.size() - 1);
            values.set(elem, sum);
            System.out.println(Arrays.toString(values.toArray()));
        }
    }
}
