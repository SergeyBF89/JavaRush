package org.level_4_lecture_3_by_10.lecture_9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TypeDouble {
    public static void main(String[] args) {
        // Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
        //Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
        //Результатом должно стать целое число (тип int).
        // Для этого нужно привести к типу int результат умножения (отбросить дробную часть, округлив вниз до целого числа).
        //В качестве значения pi используй 3.14.
        //
        //Пример ввода:
        //5
        //
        //Пример вывода:
        //78

        // Требования:
        //•	Программа должна считывать целое число c клавиатуры.
        //•	Программа должна выводить число на экран.
        //•	Программа должна выводить на экран площадь круга радиусом radius, приведенную к целому числу.

//        Scanner scanner = new Scanner(System.in);
//        int radius = scanner.nextInt();
//        double pi = 3.14;
//        System.out.println((int) (pi * radius * radius));

//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Введите целое число: ");
//            int radius = scanner.nextInt();
//            scanner.close();
//            double pi = 3.14;
//            int s = (int)(pi * radius * radius);
//            System.out.println("Площадь круга, радиусом " + radius + " = " + s);
//        } catch (InputMismatchException e) {
//            System.out.println("Ошибка ввода " + e.getClass().getSimpleName() + ", введены не корректные данные!");
//        }

        // Давай разделим ящик колы на кабинет программистов. Для этого напишем программу, в которой:
        //
        //Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике.
        // Второе - количество людей в кабинете.
        //Вывести на экран результат деления первого числа на второе.
        //Результатом должно быть вещественное число.
        //Пример ввода:
        //3
        //2
        //
        //Пример вывода:
        //1.5

        // Требования:
        //•	Программа должна считывать целые числа c клавиатуры.
        //•	Программа должна выводить число на экран.
        //•	Программа должна выводить на экран вещественное число - результат деления первого введенного целого числа на второе.

//        Scanner scanner = new Scanner(System.in);
//        int quantityJar = scanner.nextInt();
//        int quantityPeople = scanner.nextInt();
//        double division = quantityJar * 1.0 / quantityPeople;
//        System.out.println(division);

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");
            int quantityJar = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int quantityPeople = scanner.nextInt();
            scanner.close();
            double division = quantityJar * 1.0 / quantityPeople;
            System.out.printf("Количество банок колы на кабинет программистов = " + "%.1f", division);
        }catch (InputMismatchException e) {
            System.out.println("Ошибка ввода: " + e.getClass().getSimpleName() + ", введены не корректные данные!");
        }
    }
}
