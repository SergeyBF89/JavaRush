package org.level_1_lecture_1_by_8.lecture_4;

public class VariableTypes {
    public static void main(String[] args) {
        // Типы переменных
        String str; // переменная str может хранить текст
        int x; // переменная х может хранить целые числа
        double y; // переменная у может хранить дробные числа
        str = "Hello World";
        x = 5;
        y = 3.14;
        System.out.println(str + ", " + x + ", " + y); // Hello World, 5, 3.14
        System.out.println(str + ", " + x + " + " + y + " = " + x + y); // Hello World, 5 + 3.14 = 53.14
        String str2 = "Hello";
        String str3 = "Sergey";
        System.out.println(str2 + " " + str3); // Hello Sergey
        int age = 34;
        System.out.println(str2 + " " + str3 + ", age = " + age); // Hello Sergey, age = 34

        // Объяви переменные a, b типа int.
        //Сразу же в строке объявления присвой им разные значения.
        //Значениями могут быть любые целые числа.
        int a = 4, b = 5;
        System.out.println(a + " " + b); // 4 5

        // Сейчас 3126 год. Мой друг родился 8 лет назад.
        //Написать программу, выводящую на экран год рождения моего друга.
        int ageFriend = 3126 - 8;
        System.out.println(ageFriend); // 3118
    }
}
