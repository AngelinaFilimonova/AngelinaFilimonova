package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class SerilizationThree {
    public static void main(String[] args) {
        try (ObjectInputStream is = new ObjectInputStream(
                new FileInputStream("/Users/angelinafilimonova/Downloads/list.ser"))) {
            ArrayList<Integer> list = (ArrayList<Integer>) is.readObject();
            int max = list.get(0);
            for(int i = 0; i < list.size(); i++){
                if (list.get(i) > max){
                    max = list.get(i);
                }
            }
            System.out.println(max);
        } catch (ClassCastException ex) {
            System.out.println("В файле не double[] (скорее всего, сериализован Double[]): " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Ошибка чтения: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс при десериализации: " + ex.getMessage());
        }
    }
}
