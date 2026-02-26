package AQA.Java.FirstTask;

import AQA.Java.FirstTask.Kotik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kotik kotik1 = new Kotik();
        Kotik kotik2 = new Kotik(kotik1.getNameCat(), kotik1.getWeight(), kotik1.getSytost());
        kotik1.setNameCat("Kisa");
        kotik2.setNameCat("Скуби");
        kotik2.liveAnotherDay();
        System.out.println(kotik1.getNameCat());
    }
}
