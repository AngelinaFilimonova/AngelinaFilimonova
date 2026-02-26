package Potoki.Symbol;

import java.io.*;

public class SynbolPotokiThree {
    public static void main(String[] args) {
        String inputFile = "/Users/angelinafilimonova/Downloads/data1.txt";
        String outputFile = "/Users/angelinafilimonova/Downloads/res.txt";

        
        System.out.println("Читаем из файла");
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             FileWriter fw = new FileWriter(outputFile)) {
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" +");
                StringBuilder resultLine = new StringBuilder();
                
                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    if (word.toLowerCase().contains("поток")) {
                        word = "XXX";
                    }else{
                        resultLine.append(" ");
                    }
                    resultLine.append(word);
                }
                
                // Убираем возможные пробелы в конце и записываем строку
                String finalLine = resultLine.toString().trim();
                fw.write(finalLine);
                fw.write("\r\n");
            }
            
            System.out.println("Запись в файл произведена!");
        } catch (IOException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
