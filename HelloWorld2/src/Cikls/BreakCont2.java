package Cikls;

import java.util.Scanner;

public class BreakCont2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        if (num == 1){
            System.out.println("NO");
            return;
        }
        int i = 0;
        while (i < num) {
            i++;
            if (num % i == 0) {
                count++;
            }

            if (count > 2) {
                System.out.println("NO");
                break;
            }
        }
        if (count == 2){
            System.out.println("YES");
        }
    }
}
