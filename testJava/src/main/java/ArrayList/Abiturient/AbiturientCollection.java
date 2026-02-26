package ArrayList.Abiturient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class AbiturientCollection {

    private List<Abiturient> abiturients;

    public AbiturientCollection() {
        abiturients = new ArrayList<>();
    }

    void readAbiturients(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line;
            while (!"end".equals(line = br.readLine())){
                if (!line.contains("#")) {
                    continue;
                }
                try {
                    String[] parts = line.split("#");

                    abiturients.add(new Abiturient(parts[0],parts[1],Integer.parseInt(parts[2]),
                            Integer.parseInt(parts[3]),Integer.parseInt(parts[4])));
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                  
                }
            }
            if (abiturients.isEmpty()) {
                System.out.print("Список пуст");
            }
        }catch (Exception e) {
        }
    }

    void printDesc(){
        Collections.sort(abiturients, new Comparator<Abiturient>() {
            @Override
            public int compare(Abiturient o1, Abiturient o2) {
                return Double.compare(o2.averageMarks(), o1.averageMarks()); // сортировка по убыванию
            }
        });
        for(Abiturient item:abiturients){
            System.out.println(item);
        }
    }

    void printSort(){
        Collections.sort(abiturients); //сортировка
        for (Abiturient abiturient : abiturients) {
            System.out.println(abiturient.toString());
        }
    }
}
