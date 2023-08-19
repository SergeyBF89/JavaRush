package org.level_3_lecture_3_by_9.lecture_3;

import java.util.Scanner;

public class OperatorIfElse {
    public static void main(String[] args) {
        // Ввести с клавиатуры температуру на улице.
        // Если температура меньше 0, вывести надпись "на улице холодно", иначе - вывести надпись "на улице тепло".

        // Требования:
        //•	Программа должна считывать значение температуры c клавиатуры.
        //•	Программа должна использовать команду System.out.println() или System.out.print().
        //•	Если температура меньше 0, вывести только сообщение "на улице холодно".
        //•	Если температура больше либо равна 0, вывести только сообщение "на улице тепло".

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите температуру на улице: ");
//        if (scanner.hasNextInt()) {
//            int temperature = scanner.nextInt();
//            scanner.close();
//            if (temperature < 0) {
//                System.out.println("На улице холодно");
//            } else {
//                System.out.println("На улице тепло");
//            }
//        } else {
//            System.out.println("Введены не правильные данные температуры!");
//        }


        // Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно),
        // то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры.

        // Требования:
        //•	Программа должна считывать данные с клавиатуры два раза.
        //•	Программа должна использовать команду System.out.println() или System.out.print().
        //•	Если возраст в пределах 18-28 (включительно), то вывести только сообщение "Имя, явитесь в военкомат".
        //•	Если возраст не находится в указанных пределах, то ничего выводить не нужно.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();
        scanner.close();
        if (age >= 18 && age <= 28) {
            System.out.println(name + ", " + "явитесь в военкомат!");
        }
    }
}
