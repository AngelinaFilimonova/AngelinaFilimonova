package Potoki.Bait;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        byte[] buffer = new byte[10];
        int number = 0;
        try {
            number = System.in.read(buffer);
        }catch(IOException ex){
            System.out.println("Ошибка ввода-вывода: " + ex.getMessage());
        }
        for (int i = 0; i < number; i++) {
            System.out.write(buffer[i]);
        }
        System.out.flush();
    }
}
