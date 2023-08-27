package org.level_4_lecture_3_by_10.lecture_10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TypeDouble {
    public static void main(String[] args) {
        // Обычно скорость ветра указывается в м/с и не всегда понятно, насколько это много или мало.
        //Привычнее видеть величину скорости в км/ч, как у автомобиля, велосипеда или другого транспорта.
        //Поэтому сделаем конвертер величин скорости из м/с в км/ч.
        //Исходную величину скорости ветра в м/с нужно получить, считав ее как целое число из клавиатуры.
        //Соотношение скоростей такое: 1 м/с = 3.6 км/ч.
        //Необходимо вывести на экран скорость ветра в км/ч, округленную до ближайшего целого числа.
        //Для округления необходимо использовать метод Math.round().

        // Требования:
        //•	Программа должна считывать целые числа c клавиатуры.
        //•	Программа должна выводить число на экран.
        //•	Программа должна выводить на экран целое число - результат округления введенного целого числа, умноженного на 3.6.
        //•	В программе необходимо использовать метод Math.round().

//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        double speedMS = 3.6;
//        double speedKH = number * speedMS;
//        System.out.println(Math.round(speedKH));

//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Введите число: ");
//            int number = scanner.nextInt();
//            double speedMS = 3.6;
//            double speedKH = number * speedMS;
//            System.out.println(Math.round(speedKH));
//        } catch (InputMismatchException e) {
//            System.out.println("Ошибка ввода " + e.getClass().getSimpleName() + ", введены не корректные данные!");
//        }

        // В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан.
        // Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
        //Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner.
        // В зависимости от полученных данных, округлить переменную glass: до целого числа вниз (0),
        // если пессимист (false) и до целого числа вверх (1), если оптимист (true).
        //Результат вывести на экран.
        //
        //Пример ввода:
        //true
        //
        //Пример вывода:
        //1

        // Подсказка:
        //Чтобы округлить вещественное число до целого вниз, используй метод Math.floor(), вверх - метод Math.ceil().
        //
        //Требования:
        //•	Программа должна считывать c клавиатуры данные типа boolean.
        //•	Программа должна выводить целое число на экран согласно условию.
        //•	В программе необходимо использовать метод Math.floor().
        //•	В программе необходимо использовать метод Math.ceil().

        Scanner scanner = new Scanner(System.in);
        boolean data = scanner.nextBoolean();
        double glass = 0.5;
        if (data == true) {
            System.out.println((int) Math.ceil(glass));
        } else {
            System.out.println((int) Math.floor(glass));
        }

    }
}
