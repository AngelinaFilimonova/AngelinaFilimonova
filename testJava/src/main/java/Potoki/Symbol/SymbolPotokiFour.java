package Potoki.Symbol;

import java.io.*;

public class SymbolPotokiFour {
    public static void main(String[] args) {
        String inputFile = "/Users/angelinafilimonova/Downloads/data2.txt";
        int count = 0;

        System.out.println("Читаем из файла");
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (Character.isDigit(c)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
