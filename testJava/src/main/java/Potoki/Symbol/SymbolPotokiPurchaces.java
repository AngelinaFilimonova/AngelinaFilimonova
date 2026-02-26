package Potoki.Symbol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class SymbolPotokiPurchaces {
    public static void main(String[] args) {
        String inputFile = "/Users/angelinafilimonova/Downloads/purchases.txt";
        Purchace[] shop = null;
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8))){
            String buffer;
            int number = Integer.parseInt(br.readLine());
            shop = new Purchace[number];
            for (int i = 0; i < shop.length; i++) {
                buffer = br.readLine();
                String[] parts = buffer.split(";");
                shop[i] = new Purchace(parts[0], Integer.parseInt(parts[1]), Double.parseDouble(parts[2]));
            }

            double min = shop[0].getCost()*shop[0].getCount();
            int imin = 0;
            for (int i = 1; i < shop.length; i++) {
                if (shop[i].getCost()*shop[i].getCount()<min) {
                    min = shop[i].getCost()*shop[i].getCount();
                    imin = i;
                }
            }
            System.out.println(shop[imin]);

        } catch (IOException ex) {
            System.out.println("Ошибка чтения из файла + " + ex.getMessage());
        }
    }
}