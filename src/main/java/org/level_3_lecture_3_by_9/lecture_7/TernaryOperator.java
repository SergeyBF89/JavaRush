package org.level_3_lecture_3_by_9.lecture_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран большее из них.
        // Если числа одинаковые, то выводится любое.
        //Перепиши программу с использованием тернарного оператора, чтобы ее функционал остался без изменений.

        // Требования:
        //•	Программа должна считывать два числа c клавиатуры.
        //•	Вместо оператора if-else в программе нужно использовать тернарный оператор.
        //•	Функционал программы не должен измениться.

//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Введите первое число: ");
//            int number1 = scanner.nextInt();
//            System.out.println("Введите второе число: ");
//            int number2 = scanner.nextInt();
//            scanner.close();
//            int max = number1 >= number2 ? number1 : number2;
//            System.out.println("Большее число из введенных вами: " + max);
//        } catch (InputMismatchException e) {
//            System.out.println("Ошибка ввода, введены не корректные данные! " + e.getClass().getSimpleName());
//        }

        // Эта программа написана с использованием тернарного оператора, но не совсем понятно, что она делает.
        // Думаем, если избавиться от тернарного оператора, то станет намного понятнее.
        //Перепиши программу без использования тернарного оператора.

        // Требования:
        //•	Программа должна считывать два числа c клавиатуры.
        //•	Вместо тернарного оператора в программе должен быть использован оператор if.
        //•	Функционал программы не должен измениться.

//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Введите число: ");
//            int number1 = scanner.nextInt();
//            System.out.println("Введите второе число: ");
//            int number2 = scanner.nextInt();
//            scanner.close();
//            if (number1 < number2) {
//                System.out.println("Первое число " + number1 + " < " + number2 + " второго числа");
//            }
//            if (number1 > number2) {
//                System.out.println("Первое число " + number1 + " > " + number2 + " второго числа");
//            }
//            if (number1 == number2) {
//                System.out.println("Первое число " + number1 + " = " + number2 + " второму числу");
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Ошибка ввода, введены не корректные данные! " + e.getClass().getSimpleName());
//        }

        // Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том,
        // равны ли эти числа с точностью до одной миллионной.

        // Требования:
        //•	Программа должна считывать два числа c клавиатуры.
        //•	Если числа равны, то программа должна вывести сообщение "числа равны".
        //•	Если числа не равны, то программа должна вывести сообщение "числа не равны".
        //•	Точность сравнения должна достигать одной миллионной (0.000001).

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");
            double number1 = scanner.nextDouble();
            System.out.println("Введите второе число: ");
            double number2 = scanner.nextDouble();
            scanner.close();
            if (Math.abs(number1 - number2) < 0.000001) {
                System.out.println("Числа " + number1 + " и " + number2 + " равны");
            } else {
                System.out.println("Числа " + number1 + " и " + number2 + " не равны");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода, введенные данные не корректны! " + e.getClass().getSimpleName());
        }
    }
}
