package Serialization;

import java.io.*;

public class SerializationOne {
    public static void main(String[] args) {
        String name = null;
        try(ObjectInputStream is = new ObjectInputStream(
                new FileInputStream("/Users/angelinafilimonova/Downloads/enigma.ser"))){
            Object obj = is.readObject(); //читаем объект из файла
            name = (String) obj; //приводим к типу String
            System.out.println(name); //выводим на консоль
        }catch(IOException ex){
            System.out.println("Ошибка чтения: " + ex.getMessage());
        }catch(ClassNotFoundException ex){
            System.out.println("Не найден файл для десериализации" + ex.getMessage());
        }
    }
}
