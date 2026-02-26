package ArrayList.Commodity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Commodity> commoditiesBelarus = new ArrayList<>();
        List<Commodity> commoditiesOther = new ArrayList<>();
        
        try{
            String line;
            while (!"end".equals(line = br.readLine())){
                if (!line.contains("/")) {
                    continue;
                }
                try {
                    String[] parts = line.split("/");
                    Commodity item = new Commodity(parts[0],Integer.parseInt(parts[1]),parts[2]);
                    if (parts[2].equals("Беларусь")) {
                        commoditiesBelarus.add(item);
                    }else{
                        commoditiesOther.add(item);
                    }
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {

                }
            }

            if (commoditiesBelarus.isEmpty()) {
                System.out.println("Список товаров из Беларуси пуст");
            }else{
                Collections.sort(commoditiesBelarus);
                for (Commodity item : commoditiesBelarus) {
                    System.out.println(item);
                }
            }
            System.out.println();
            if (commoditiesOther.isEmpty()) {
                System.out.print("Список товаров из других стран пуст");
            }else{
                Collections.sort(commoditiesOther, new Comparator<Commodity>() {
                    @Override
                    public int compare(Commodity o1, Commodity o2) {
                        return Double.compare(o2.getPrice(), o1.getPrice());
                    }
                });
                for (Commodity item : commoditiesOther) {
                    System.out.println(item);
                }
            }
        }catch (Exception e) {
        }
    }
}
