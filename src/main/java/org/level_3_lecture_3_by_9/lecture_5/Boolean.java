package org.level_3_lecture_3_by_9.lecture_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        // Программа считывает с клавиатуры значение температуры тела и выдает сообщение о том, что температура тела высокая,
        // низкая или нормальная, в зависимости от условий.
        //В классе объявлены две булевые переменные isHigh (высокая температура) и isLow (низкая),
        // в которые нужно вынести соответствующие условия и вместо выражений сравнения использовать эти переменные.

        // Требования:
        //•	Программа должна считывать значение температуры c клавиатуры.
        //•	Не изменяй объявление переменных isHigh и isLow.
        //•	Переменным isHigh и isLow в методе main должны быть присвоены соответствующие выражения сравнения.
        //•	Вместо выражений сравнения в операторах if () должны быть использованы переменные isHigh и isLow.
        //•	Функционал программы не должен измениться.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите температуру тела: ");
//        if (scanner.hasNextDouble()) {
//            double bodyTemperature = scanner.nextDouble();
//            scanner.close();
//            boolean isLow = bodyTemperature < 36;
//            boolean isHigh = bodyTemperature > 37;
//            if (isLow) {
//                System.out.println("Температура тела низкая");
//            } else if (isHigh) {
//                System.out.println("Температура тела высокая");
//            } else {
//                System.out.println("Температура тела нормальная");
//            }
//        } else {
//            System.out.println("Введены не корректные данные!");
//        }

        // Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
        // Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой,
        // то вывести все три.

        // Требования:
        //•	Программа должна считывать три числа c клавиатуры.
        //•	Программа должна содержать System.out.println() или System.out.print()
        //•	Если два числа равны между собой, необходимо вывести их на экран.
        //•	Если все три числа равны между собой, необходимо вывести все три.
        //•	Если нет равных чисел, ничего не выводить.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        try {
            int number1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int number2 = scanner.nextInt();
            System.out.println("Введите третье число: ");
            int number3 = scanner.nextInt();
            scanner.close();
            if (number1 == number2 && number1 == number3) {
                System.out.println(number1 + " " + number2 + " " + number3);
            } else if (number1 == number2) {
                System.out.println(number1 + " " + number2);
            } else if (number1 == number3) {
                System.out.println(number1 + " " + number3);
            } else if (number2 == number3) {
                System.out.println(number2 + " " + number3);
            }
        } catch (InputMismatchException e) {
            System.out.println("Введены не корректные данные: " + e.getClass().getSimpleName());
        }
    }
}
