package Potoki.Symbol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SymbolPotokiPurchases2 {
    public static void main(String[] args) {
        String inputFile = "/Users/angelinafilimonova/Downloads/purchases2.txt";
        Purchace[] shop = null;
        int imin = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8))) {
            String buffer;
            int number = Integer.parseInt(br.readLine());
            shop = new Purchace[number];
            for (int i = 0; i < shop.length; i++) {
                buffer = br.readLine();
                String[] parts = buffer.split(";");
                try {
                    shop[i] = new Purchace(parts[0], Integer.parseInt(parts[1]), Double.parseDouble(parts[2]));
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) { //проблемы преобразовать данные
                    shop[i] = null;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (shop == null) {
            System.out.println("Список пуст!");
            return;
        }

        double min = shop[0].getCost();
        for (int i = 0; i < shop.length; i++) {
            if (shop[i] != null && shop[i].getCost()  < min) {
                min = shop[i].getCost();
                imin = i;
            }
        }
        System.out.println(shop[imin]);
}
}
