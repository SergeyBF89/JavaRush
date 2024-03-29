package org.level_3_lecture_3_by_9.lecture_4;

import java.util.Scanner;

public class OperatorIfElse {
    public static void main(String[] args) {
        // Есть программа, которая принимает на вход возраст и определяет, нужно в школу или уже пора в институт.
        // Но она работает неправильно. Например, пятилетнего ребенка отправляют в институт! Исправить программу несложно:
        // достаточно в нужном месте поставить фигурные скобки.

        // Требования:
        //•	Программа должна считывать число c клавиатуры.
        //•	Программа должна использовать команду System.out.println() или System.out.print().
        //•	Если возраст меньше 18 и больше либо равен 6, нужно вывести только сообщение "нужно ходить в школу".
        //•	Если возраст больше либо равен 18, нужно вывести только сообщение "пора в институт".
        //•	Если возраст меньше 6, то ничего выводить не нужно.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            scanner.close();
            if (age < 18 && age >= 6) {
                System.out.println("Нужно ходить в школу");
            } else if (age >= 18) {
                System.out.println("Пора в институт");
            }
        } else {
            System.out.println("Введены не корректные данные!");
        }
    }
}
