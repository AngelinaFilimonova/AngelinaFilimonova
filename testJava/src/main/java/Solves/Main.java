package Solves;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = input.nextLine();
        
        // Создаем объект класса USER
        USER user = new USER(name, "password", "email@example.com");
        // Вызываем метод sayHi
        user.sayHi(name);

        // Создаем объекты Triangle и Rectangle с параметрами из консоли
        System.out.println("Введите параметры для треугольника (a, b, height):");
        Triangle triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
        
        System.out.println("Введите параметры для прямоугольника (a, b):");
        Rectangle rectangle = new Rectangle(input.nextDouble(), input.nextDouble());

        // Работа с прямоугольником
        Figure figure = rectangle;
        rectangle.draw();
        rectangle.move();
        // Методы Perimeter() и Area() не принимают параметры - они используют поля объекта
        System.out.println("Perimeter: " + figure.Perimeter());
        System.out.println("Area: " + figure.Area());

        // Работа с треугольником
        figure = triangle;
        triangle.draw();
        triangle.move();
        // Методы Perimeter() и Area() не принимают параметры - они используют поля объекта
        System.out.println("Perimeter: " + triangle.Perimeter());
        System.out.println("Area: " + triangle.Area());
    }

     double calculateAverageRating(double firstSemestrRating,
                                double secondSemestrRating, double thirdSemestrRating){
        double average;
        return (firstSemestrRating + secondSemestrRating + thirdSemestrRating)/.3;
    }

    public void printAverageRating(double firstSemestrRating, double secondSemestrRating,
                                     double thirdSemestrRating){
        double averageRating = calculateAverageRating(firstSemestrRating,secondSemestrRating,thirdSemestrRating);
        System.out.println("Средний балл по итогам трех семестров" + averageRating);
    }

}
