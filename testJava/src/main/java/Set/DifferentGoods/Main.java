package Set.DifferentGoods;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        TreeSet<DifferentsGoods> goods = new TreeSet<>();
        try{
            while ((!"end".equals(input = br.readLine()))) {
                try {
                    String[] parts = input.split("#");
                    if (parts.length >= 3) {
                        goods.add(new DifferentsGoods(parts[0], parts[1], Integer.parseInt(parts[2])));
                    }
                } catch (NumberFormatException e) {
                }
            }
        }catch(Exception e){
        }
        if (goods.isEmpty()) {
            System.out.print("Set is empty");
        }else{
            Iterator<DifferentsGoods> iterator = goods.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
