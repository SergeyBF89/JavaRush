package org.level_3_lecture_3_by_9.lecture_9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        // Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.

        // Требования:
        //•	Программа должна считывать две строки c клавиатуры.
        //•	Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
        //•	Если строки разные, то программа должна вывести сообщение "строки разные".

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первую строку: ");
//        String line1 = scanner.nextLine();
//        System.out.println("Введите вторую строку: ");
//        String line2 = scanner.nextLine();
//        scanner.close();
//        System.out.println(line1.equals(line2) ? "Строки одинаковые" : "Строки разные");

        // В методе main напиши код попарного сравнения по ссылке строк string1, string2 и string3
        // с выводом соответствующего сообщения после каждого сравнения:
        //"ссылки на строки одинаковые" или "ссылки на строки разные".
        //
        //Порядок сравнения должен быть следующим:
        //- строку string1 со строкой string2
        //- строку string2 со строкой string3
        //- строку string1 со строкой string3.

        // Требования:
        //•	Поля string1, string2 и string3 и их значения изменять нельзя.
        //•	В методе main должно быть сравнение строк string1 и string2 по ссылке.
        //•	В методе main должно быть сравнение строк string2 и string3 по ссылке.
        //•	В методе main должно быть сравнение строк string1 и string3 по ссылке.
        //•	Программа должна выводить соответствующие сообщения на экран.
        //•	Программа должна выводить на экран 3 строки.

//        String string1 = "Амиго";
//        String string2 = string1;
//        String string3 = new String(string1);
//        System.out.println(string1 == string2 ? "ссылки на строки одинаковые" : "ссылки на строки разные");
//        System.out.println(string2 == string3 ? "ссылки на строки одинаковые" : "ссылки на строки разные");
//        System.out.println(string1 == string3 ? "ссылки на строки одинаковые" : "ссылки на строки разные");

        // Амиго создал секретное слово для доступа к закрытой информации, но у него сломалась клавиатура,
        // и теперь невозможно набирать буквы в верхнем регистре.
        // Напиши программу, которая будет сравнивать введенную строку со строкой из переменной secret, не учитывая регистр.
        //Если введенная строка равна строке из переменной secret, программа выводит на экран сообщение "доступ разрешен".
        // В ином случае - "доступ запрещен".

        // Требования:
        //•	Программа должна считывать строку c клавиатуры.
        //•	В классе Solution должна быть публичная статическая переменная secret типа String.
        //•	Если введенная строка и строка из переменной secret одинаковые, не учитывая регистр,
        // то программа должна вывести сообщение "доступ разрешен".
        //•	Если введенная строка и строка из переменной secret разные, не учитывая регистр,
        // то программа должна вывести сообщение "доступ запрещен".

        String secret = "AmIGo";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с паролем: ");
        String password = scanner.nextLine();
        System.out.println(secret.equalsIgnoreCase(password) ? "доступ разрешен" : "доступ запрещен");
    }
}
