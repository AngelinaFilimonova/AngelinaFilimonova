package Potoki.Symbol;

import java.io.*;

public class SymbolPotokiFive {
    public static void main(String[] args) {
        String inputFile = "/Users/angelinafilimonova/Downloads/data3.txt";
        double sum = 0, avg = 0;
        int count = 0;

        System.out.println("Читаем из файла");
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" +");
                for (int i = 0; i < words.length; i++) {
                    try {
                        double value = Double.parseDouble(words[i]);
                        count++;
                        sum += value;
                    } catch (NumberFormatException e) {
                    }
                }
            }
            avg = sum / count;
            System.out.printf("Среднее арифметическое = %.2f", avg);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
