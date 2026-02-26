package Potoki.Bait;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileFour {
    public static void main(String[] args) {
        try(DataInputStream in = new DataInputStream(
                new FileInputStream("/Users/angelinafilimonova/Downloads/array.dat"))){
            int count = in.readInt();  // первое число — количество элементов
            double sum = 0;
            for (int i = 0; i < count; i++) {
                sum += in.readInt();
            }
            System.out.printf("%.1f", sum/count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
