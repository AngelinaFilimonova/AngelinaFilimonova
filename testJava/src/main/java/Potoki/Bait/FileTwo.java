package Potoki.Bait;

import java.io.FileInputStream;
import java.io.IOException;

public class FileTwo {
    public static void main(String[] args) throws IOException {
        int count = 0;
        try (FileInputStream in1 = new FileInputStream("/Users/angelinafilimonova/Downloads/data.dat");
             FileInputStream in2 = new FileInputStream("/Users/angelinafilimonova/Downloads/promo.dat")) {
            int item1, item2 = 0;

            while ((item1 = in1.read()) != -1 && (item2 = in2.read()) != -1) {
                if (item1 == item2){
                    count++;
                }
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода -вывода: " + ex.getMessage());
        }
        System.out.println(count);
    }
}
