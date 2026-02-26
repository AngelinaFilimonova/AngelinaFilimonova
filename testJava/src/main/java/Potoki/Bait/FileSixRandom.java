package Potoki.Bait;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileSixRandom {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("/Users/angelinafilimonova/Downloads/my.bin", "rw")) {
            double x1 = raf.readDouble();
            raf.seek(9 * Double.BYTES);
            double x2 = raf.readDouble();
            double res = x1 + x2;
            System.out.printf("%.3f", res);
        } catch (IOException ex) {
            System.out.println("Ошибка обращения к файлу: " + ex.getMessage());
        }
    }
}
