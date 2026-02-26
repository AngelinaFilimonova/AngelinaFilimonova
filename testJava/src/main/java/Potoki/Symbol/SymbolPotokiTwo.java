package Potoki.Symbol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SymbolPotokiTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int ch;

        while ((ch = br.read()) != -1) {
            if (ch == '#') {      // стоп-символ
                break;
            }
            sb.append((char) ch);
        }

        // Удаляем все цифры
        String result = sb.toString().replaceAll("\\d", "");

        System.out.print("\n"+result);
    }
}
