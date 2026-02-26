package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class SerializationTwo {
    public static void main(String[] args) {
        double sum = 0;
        try (ObjectInputStream is = new ObjectInputStream(
                new FileInputStream("/Users/angelinafilimonova/Downloads/massiv.ser"))) {
            double[] numbers = (double[]) is.readObject(); // читаем строго double[]
            for(int i = 0; i < numbers.length; i++){
                sum += numbers[i];
            }
            System.out.printf("Среднее %.2f", sum / numbers.length);
        } catch (ClassCastException ex) {
            System.out.println("В файле не double[] (скорее всего, сериализован Double[]): " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Ошибка чтения: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс при десериализации: " + ex.getMessage());
        }
    }
}
