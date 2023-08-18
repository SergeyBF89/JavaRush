package org.level_2_lecture_3_by_8.lecture_6;

public class ExampleStrings {
    public static void main(String[] args) {
        // В переменную tagline нужно записать строку "JustDoIt".
        //Используй s1, s2, s3 и конкатенацию строк.

        // Требования:
        //•	Не изменяй значения переменных s1, s2, s3.
        //•	Для инициализации переменной tagline используй s1, s2, s3 и конкатенацию строк.
        //•	Программа должна выводить на экран значение переменной tagline.

        String str1 = "Do", str2 = "It", str3 = "Just";
        String tagLine = str3 + str1 + str2;
        System.out.println(tagLine); // JustDoIt

        // Используй переменную emptiness, строки с одним пробелом и конкатенацию строк,
        // чтобы записать в переменную fullness строку "пустота пустота пустота".

        // Требования:
        //•	Не изменяй значение переменной emptiness.
        //•	Переменную fullness нужно инициализировать в одну строку, используя переменную emptiness,
        // строки с одним пробелом и конкатенацию строк.
        //•	Программа должна выводить на экран значение переменной fullness.

        String emptiness = "пустота";
        String fullness = emptiness + " " + emptiness + " " + emptiness;
        System.out.println(fullness); // пустота пустота пустота

        // В переменную digits нужно записать строку "60".
        //Используй переменные x, y, z, пустую строку и конкатенацию строк.

        // Требования:
        //•	Не изменяй значения переменных x, y, z.
        //•	Для инициализации переменной digits используй x, y, z, пустую строку и конкатенацию строк.
        //•	Программа должна выводить на экран переменную digits.

        int x = 2, y = 4, z = 0;
        String digits = x + y + "" + z;
        System.out.println(digits); // 60

        // В переменную hugeAmount нужно записать число 100500.
        //Используй переменные bigAmount, greatAmount и преобразование строки в число.
        //Для объявления и инициализации hugeAmount используй одну команду.

        // Требования:
        //•	Не изменяй значения переменных bigAmount и greatAmount.
        //•	Для инициализации переменной hugeAmount используй bigAmount, greatAmount и метод Integer.parseInt(String).
        //•	Программа должна выводить на экран переменную hugeAmount.

        String bidAmount = "500";
        String greatAmount = "100000";
        int hugeAmount = Integer.parseInt(bidAmount) + Integer.parseInt(greatAmount);
        System.out.println(hugeAmount); // 100500

        // В методе main на экран выводятся значения трех строк.
        //Внеси изменения в код, чтобы вместо значений строк вывелась длина каждой строки.

        // Требования:
        //•	Не изменяй значение переменной emptyString.
        //•	У трех строк, переданных в метод println, нужно вызвать метод length.
        //•	Программа должна вывести на экран три числа, каждое - с новой строки.

        String emptyString = "";
        System.out.println(emptyString.length()); // 0
        System.out.println("Я изучаю Java!".length()); // 14
        System.out.println((emptyString + 2 + 2 + "22").length()); // 4

        // Метод main выводит на экран четыре строки. Все они - яркий пример злоупотребления заглавными буквами.
        //Внеси изменения в код, чтобы все буквы в этих строках стали строчными.

        // Требования:
        //•	Не изменяй значения переменных title, degree и career.
        //•	У четырех строк, переданных в метод println, нужно вызвать метод toLowerCase.
        //•	Вывод программы должен содержать четыре строки.

        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";
        System.out.println(title.toLowerCase());
        System.out.println(degree.toLowerCase());
        System.out.println(career.toLowerCase());

        // В методе main на экран выводятся три строки.
        //Внеси изменения в код, чтобы все буквы в этих строках стали заглавными.

        // Требования:
        //•	Не изменяй значения переменных caps и usa.
        //•	У трех строк, переданных в метод println, вызови метод toUpperCase.
        //•	Вывод программы должен содержать три строки.

        String caps = "if I type in caps ";
        String usa = "сша";
        System.out.println(caps.toUpperCase());
        System.out.println(usa.toUpperCase());
    }
}
