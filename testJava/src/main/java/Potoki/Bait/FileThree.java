package Potoki.Bait;

import java.io.*;

public class FileThree {
    public static void main(String[] args) {
        double sum = 0;
        try(DataInputStream in = new DataInputStream(
                new FileInputStream("/Users/angelinafilimonova/Downloads/numbers.info"))){
            double item;
            for (int i=0;i<35;i++){
                item = in.readDouble();
                sum += item;
            }

        }catch(IOException ex){
            System.out.println("Ошибка ввода-вывода: " + ex.getMessage());
        }
        System.out.printf("%.2f", sum);
    }
}
