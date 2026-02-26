package Potoki.Bait;

import java.io.FileInputStream;
import java.io.IOException;

public class FileOne {
    public static void main(String[] args) {
        int count = 0;
        try (FileInputStream in = new FileInputStream("/Users/angelinafilimonova/Downloads/info.dat");) {
            int item;
            while ((item = in.read()) != -1) {
                if (item >= 50 && item <= 100){
                    count++;
                }
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода -вывода: " + ex.getMessage());
        }
        System.out.println(count);
    }
}
