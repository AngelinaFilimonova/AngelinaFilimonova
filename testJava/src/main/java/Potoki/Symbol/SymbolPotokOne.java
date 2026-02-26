package Potoki.Symbol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class SymbolPotokOne
{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        double summa = 0;
        int count = 0;
        try {
            while (!(str = br.readLine()).equals("stop")) { //читаем строки, пока не будет stop
                String[] words = str.split(" +"); //разбиваем строку на слова, разделенные пробелами
                for (String item:words) {
                    try {
                        Integer.parseInt(item); //пытаемся преобразовать в int
                        count++;
                    } catch (NumberFormatException ex) { //это не целое
                        try {
                            double x = Double.parseDouble(item); //пытаемся преобразовать вы double
                            summa += x;
                        } catch (NumberFormatException ex2) {
                            System.out.println("это текст");
                        }
                    }
                }
                System.out.println(Arrays.toString(words));
            }
            System.out.printf("%d %.1f", count, summa);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода: " + ex.getMessage());
        }
    }
}
