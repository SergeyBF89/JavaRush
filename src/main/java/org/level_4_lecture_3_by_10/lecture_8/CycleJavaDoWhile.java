package org.level_4_lecture_3_by_10.lecture_8;

import java.util.Scanner;

public class CycleJavaDoWhile {
    public static void main(String[] args) {
        // Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
        //Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
        //Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.
        //Пример ввода:
        //абв
        //2
        //
        //Пример вывода:
        //абв
        //абв

        // Требования:
        //•	Программа должна считывать данные c клавиатуры.
        //•	Программа должна выводить данные на экран.
        //•	Программа должна выводить на экран строку number раз.
        //•	Программа должна выводить на экран строку один раз, если число number меньше/равно 0 или больше/равно 5.
        //•	В программе необходимо использовать цикл do-while.

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int number = scanner.nextInt();
        int counter = 0;
        do {
            System.out.println(str);
            counter++;
        } while (counter < number && number < 5);
    }
}
