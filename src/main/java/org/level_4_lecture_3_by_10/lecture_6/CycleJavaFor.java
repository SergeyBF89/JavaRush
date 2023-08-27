package org.level_4_lecture_3_by_10.lecture_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CycleJavaFor {
    public static void main(String[] args) {
        // Напиши программу, в которой с помощью цикла for на экран будут выведены чётные числа от 1 до 15.
        //Каждое значение нужно выводить с новой строки.

        // Требования:
        //•	Программа должна выводить текст на экран.
        //•	Программа должна выводить чётные числа от 1 до 15. Каждое значение вывести с новой строки.
        //•	В программе необходимо использовать цикл for.

//        for (int i = 0; i <= 15; i++) {
//            if (i % 2 == 0)
//                System.out.println("Четные числа от 1 до 15: " + i);
//        }

        // В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
        //Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до end (не включительно),
        // кратных multiple.
        //Для этого используй цикл for.
        //Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.

        // Требования:
        //•	Программа должна вывести в консоль сумму чисел от start (включительно) до end (не включительно), кратных multiple.
        //•	В программе необходимо использовать цикл for.
        //•	В цикле for необходимо использовать оператор continue.

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");
            int start = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int end = scanner.nextInt();
            System.out.println("Введите третье число: ");
            int multiple = scanner.nextInt();
            scanner.close();
            int summa = 0;
            for (; start < end; start++) {
                if (start % multiple == 0) {
                    summa += start;
                }
            }
            System.out.println("Сумма всех чисел в промежутке от " + start + " до " + end + " = " + summa);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода, введены не корректные данные! " + e.getClass().getSimpleName());
        }
    }
}
