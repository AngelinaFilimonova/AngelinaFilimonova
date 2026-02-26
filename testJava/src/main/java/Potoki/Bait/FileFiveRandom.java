package Potoki.Bait;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileFiveRandom {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("/Users/angelinafilimonova/Downloads/data.bin", "rw")) {
            raf.seek(6 * Integer.BYTES); //указатель файла - на третье вещественное число
            int x = raf.readInt(); //считать число из файла
            System.out.println("Прочли из файла: " + x);
        } catch (IOException ex) {
            System.out.println("Ошибка обращения к файлу: " + ex.getMessage());
        }
    }
}
