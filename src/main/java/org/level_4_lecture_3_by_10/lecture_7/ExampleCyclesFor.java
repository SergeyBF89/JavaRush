package org.level_4_lecture_3_by_10.lecture_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleCyclesFor {
    public static void main(String[] args) {

        // Давай используем цикл for, чтобы вывести на экран прямоугольный треугольник из восьмёрок со
        // сторонами (катетами) 10 и 10.
        //То есть в первой строке должна быть одна 8, начиная слева, во второй - две и т.д.
        //
        //Пример вывода на экран:
        //8
        //88
        //888
        //8888
        //88888
        //888888
        //8888888
        //88888888
        //888888888
        //8888888888

        // Требования:
        //Программа должна выводить числа на экран.
        //Программа должна выводить прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
        //В программе необходимо использовать цикл for.
        //Вывод на экран должен происходить в цикле for.

//        for (int i = 1; i <= 10; i++) {
//            for (int j = 0; j < i; j++ ) {
//                System.out.print("8");
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите число строк треугольника: ");
            int number = scanner.nextInt();
            scanner.close();
            for (int i = 1; i <= number; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("8");
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода: " + e.getClass().getSimpleName() + ", введены не корректные данные!");
        }
    }
}
