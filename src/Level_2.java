import java.util.Scanner;
// В методе main объяви переменные intValue, numericValue, size, number типа int.
//Присвой им разные значения. Используй одну команду для создания и инициализации переменных.
//Значениями могут быть любые целые числа.
/**
public class Level_2 {
    public static void main(String[] args) {
        int intValue = 1, numericValue = 2, size = 43, number = 8;
    }
}
 */

// В переменной centimeters записано количество сантиметров.
//В переменную meters нужно записать количество полных метров в centimeters (1 метр = 100 см).
//Для вычисления используй переменную centimeters и оператор деления.
//Для объявления и инициализации meters используй одну команду.
/**
public class Level_2 {
    public static void main(String[] args) {
        int centimeters = 243;
        int meters = 0;
        meters = centimeters / 100;
        System.out.println(meters); // 2
    }
}
 */

// В переменной number записано число.
//В переменную lastDigit нужно записать последнюю цифру этого числа.
//Для вычисления используй переменную number и оператор «остаток от деления».
//Для объявления и инициализации lastDigit используй одну команду.
/**
public class Level_2 {
    public static void main(String[] args) {
        int number = 546;
        int lastDigit = number % 10;
        System.out.println(lastDigit); // 6
    }
}
*/

// Используя только оператор инкремента, измени значение в переменной six, чтобы на экран вывелась цифра 9.
/**
public class Level_2 {
    public static void main(String[] args) {
        int six = 6;
        six++; six++; six++;
        System.out.println(six);
    }
}
 */

// Используя только оператор декремента, измени значение переменной toothCounter, чтобы на экран вывелось число 23.
/**
public class Level_2 {
    public static void main(String[] args) {
        int toothCounter = 32;
        toothCounter--; toothCounter--; toothCounter--; toothCounter--;
        toothCounter--; toothCounter--; toothCounter--; toothCounter--; toothCounter--;
        System.out.println(toothCounter);
    }
}
 */

// В методе main объяви переменные word, phrase, line и text типа String.
//Присвой им разные значения. Используй одну команду для создания и инициализации переменных.
//Значениями могут быть любые строки.
/**
public class Level_2 {
    public static void main(String[] args) {
        String word = "book", phrase = "fantasy book", line = "interesting book",
                text = "this fantasy book is easy to read";
    }
}
 */

// В переменную tagline нужно записать строку "JustDoIt".
//Используй s1, s2, s3 и конкатенацию строк.
/**
public class Level_2 {
    public static void main(String[] args) {
        String s1 = "Do";
        String s2 = "It";
        String s3 = "Just";
        String tagLine = s3 + s1 + s2;
        System.out.println(tagLine);

    }
}
 */

// Заполни пробелы пустотой... или наоборот.
//Используй переменную emptiness, строки с одним пробелом и конкатенацию строк, чтобы записать в переменную fullness строку "пустота пустота пустота".
/**
public class Level_2 {
    public static void main(String[] args) {
        String emptiness = "пустота";
        String fullness = emptiness + " " + emptiness + " " + emptiness;
        System.out.println(fullness);
    }
}
 */

// В переменную digits нужно записать строку "60".
//Используй переменные x, y, z, пустую строку и конкатенацию строк.
/**
public class Level_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;
        String digits = x + y + "" + z;
        System.out.println(digits);
    }
}
 */

// В переменную hugeAmount нужно записать число 100500.
//Используй переменные bigAmount, greatAmount и преобразование строки в число.
//Для объявления и инициализации hugeAmount используй одну команду.

import java.util.Locale;

/**
public class Level_2 {
    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";
        int hugeAmount = Integer.parseInt(bigAmount) + Integer.parseInt(greatAmount); // преобразование строки в число
        System.out.println(hugeAmount);
    }
}
 */

// Метод toLowerCase() позволяет преобразовать все символы строки в маленькие (строчные):
/**
public class Level_2 {
    public static void main(String[] args) {
        String name = "ROM";
        String name2 = name.toLowerCase(Locale.ROOT);
        System.out.println(name2);
    }
}
 */

// Метод toUpperCase() позволяет преобразовать все символы строки в большие (заглавные):
/**
public class Level_2 {
    public static void main(String[] args) {
        String name = "rom";
        String name2 = name.toUpperCase(Locale.ROOT);
        System.out.println(name2);
    }
}
 */

// В методе main на экран выводятся значения трех строк.
//Внеси изменения в код, чтобы вместо значений строк вывелась длина каждой строки.
/**
public class Level_2 {
    public static void main(String[] args) {
        String emptyString = "";
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }
}
 */

// Метод main выводит на экран четыре строки. Все они - яркий пример злоупотребления заглавными буквами.
//Внеси изменения в код, чтобы все буквы в этих строках стали строчными.
/**
public class Level_2 {
    public static void main(String[] args) {
        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";
        System.out.println("RESUME".toLowerCase());
        System.out.println("TITLE: ".toLowerCase() + title.toLowerCase());
        System.out.println("DEGREE: ".toLowerCase() + degree.toLowerCase());
        System.out.println("CAREER: ".toLowerCase() + career.toLowerCase());
    }
}
 */

// В методе main на экран выводятся три строки.
//Внеси изменения в код, чтобы все буквы в этих строках стали заглавными.
/**
public class Level_2 {
    public static void main(String[] args) {
        String caps = "if I type in caps ";
        String usa = "сша";
        System.out.println(usa.toUpperCase());
        System.out.println("Винни пух".toUpperCase());
        System.out.println(caps.toUpperCase() + "they know I mean business".toUpperCase());
    }
}
 */

// Считывание с клавиатуры с помощью объекта типа Scanner
/**
public class Level_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
*/

// Пример программы, которая считывает с клавиатуры два числа и выводит их сумму:
/**
public class Level_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
*/

// Считай с клавиатуры три строки.
//А затем:
//
//Выведи на экран третью строку в неизменном виде.
//Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
//Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.
//Пример ввода:
//
//Строка Номер РАЗ
//Вторая строка
//Строка 3
//Пример вывода:
//
//Строка 3
//ВТОРАЯ СТРОКА
//строка номер раз
/**
public class Level_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строки: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        System.out.println(str3);
        System.out.println(str2.toUpperCase());
        System.out.println(str1.toLowerCase());
    }
}
*/

// Считай с клавиатуры три целых числа.
//Выведи на экран их среднее арифметическое.
//
//Пример ввода:
//
//51
//101
//201
//Пример вывода:
//
//117
//Среднее арифметическое - это число, равное сумме всех чисел, деленной на их количество.
//Используй деление без остатка.
/**
public class Level_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println((number1 + number2 + number3) / 3);
    }
}
*/

// hasNextByte()
//Там тип byte? Его можно будет преобразовать к byte?
//hasNextShort()
//Там тип short? Его можно будет преобразовать к short?
//hasNextInt()
//Там тип int? Его можно будет преобразовать к int?
//hasNextLong()
//Там тип long? Его можно будет преобразовать к long?
//hasNextFloat()
//Там тип float? Его можно будет преобразовать к float?
//hasNextDouble()
//Там тип double? Его можно будет преобразовать к double?
//hasNextBoolean()
//Там тип boolean? Его можно будет преобразовать к boolean?
//hasNext()
//Там есть еще одно слово?
//hasNextLine()
//Там есть еще одна строка?

// Вместо объекта System.in мы при создании объекта типа Scanner передаем в него строку – str.
// И теперь объект scanner будет считывать данные из строки. Пример:
/**
public class Level_2 {
    public static void main(String[] args) {
        String str = "10 20 40 60";
        Scanner scanner = new Scanner(str);
        int a = scanner.nextInt(); // 10
        int b = scanner.nextInt(); // 20
        int c = scanner.nextInt(); // 40
        int d = scanner.nextInt(); // 60
        System.out.println(a + b + c + d); // 130
    }
}
 */

// Допольнительная лекция ко второму уровню.
//-----------------------------------Операции над числами в Java--------------------------------

// Начнем с самого простого — с арифметических операций. Это известные всем сложение (знак +), вычитание (-), умножение (*), деление (/) и остаток от деления(%)
/**
public class Level_2 {
    public static void main(String[] args) {
        int x = 999;
        int y = 33;
        System.out.println(x + y); // 1032
        System.out.println(x - y); // 966
        System.out.println(x * y); // 32967
        System.out.println(x / y); // 30
        System.out.println(x % y); // 9
    }
}
 */

// В Java (как и в математике) реализованы операции сравнения. Они тебе тоже наверняка знакомы еще со школы:
//равно (==)
//больше (>)
//меньше (<)
//больше либо равно (>=)
//меньше либо равно (<=)
//не равно (!=)

// Здесь стоит обратить внимание на один важный момент, в котором многие новички допускают ошибки. Операция “равно” записывается как ==, а не одним знаком =.
//
//Единичный знак = в Java является оператором присваивания, когда переменной присваивается число, строка, или значения другой переменной.
/**
public class Level_2 {
    public static void main(String[] args) {
        int x = 33;
        int y = 999;
        System.out.println(x = y); // 999, Значение y (999) было присвоено переменной x, и после мы вывели x на консоль.
    }
}
 */

// Еще одна особенность операции присваивания (=) — ее можно осуществлять “по цепочке”:
/**
public class Level_2 {
    public static void main(String[] args) {
        int x = 999;
        int y = 33;
        int z = 256;
        x = y = z;
        System.out.println(x); // 256,
    }
}
//Запомни: присваивание осуществляется справа налево.
//
//Данное выражение (x = y = z) будет выполнено по шагам:
//y = z , то есть у = 256
//x = y, то есть x = 256
*/

// Унарные операции
//Они называются “унарными” от слова “uno” — “один”. Такое название они получили потому, что в отличие от предыдущих, проводятся над одним числом, а не над несколькими.
//
//К ним относятся:
//Унарный минус. Он меняет знак числа на противоположный.
/**
public class Level_2 {
    public static void main(String[] args) {
        int x = 999;
        x = -x;
        System.out.println(x); // -999
        x = -x;
        System.out.println(x); // 999
    }
}
// Мы использовали унарный минус два раза. В результате наше число стало сначала отрицательным, а потом снова положительным!
 */

// Инкремент (++) и декремент (--)
//
//Операция ++ увеличивает число на единицу, а операция -- уменьшает на эту же самую единицу.
/**
public class Level_2 {
    public static void main(String[] args) {
        int x = 999;
        x++;
        System.out.println(x); // 1000
        x--;
        System.out.println(x); // 999
    }
}
 */

// Важный момент. Операции инкремента и декремента бывают двух видов: постфиксными, и префиксными.
//
//x++ — постфиксная запись
//++x — префиксная запись
/**
public class Level_2 {
    public static void main(String[] args) {
        int x = 999;
        int y = x++;
        System.out.println(y); // 999
        System.out.println(x); // 1000
    }
}
// На самом деле, постфиксная операция потому так и называется: она выполняется после основного выражения. То есть в нашем случае:
//
//int y = x++;
//
//сначала выполняется
//
//y = x (и переменной y будет присвоено изначальное значение x), а только потом
//
//x++
 */

// Как быть, если нас не устраивает такое поведение? Нужно использовать префиксный способ записи:
/**
public class Level_2 {
    public static void main(String[] args) {
        int x = 999;
        int y = ++x;
        System.out.println(y); // 1000
    }
}
// В этом случае сначала отработает
//
//++x
//
//и только после этого
//
//y = x;
 */

// Кроме того, в Java существуют так называемые комбинированные операции. В них используется комбинация из двух операций:
//Присваивание
//Арифметическая операция
//Сюда входят операции:
//+=
//-=
//*=
///=
//%=
/**
public class Level_2 {
    public static void main(String[] args) {
        int x = 999;
        int y = 33;
        x += y;
        System.out.println(x); // 1032
        System.out.println(x -= y); // 999
        System.out.println(x *= y); // 32967
        System.out.println(x /= y); // 999
        System.out.println(x %= y); // 9
    }
}
 */

// Помимо операций над числами, в Java существуют также операции над булевыми переменными — true и false.
//
//Эти операции выполняются с помощью логических операторов
//! — оператор “НЕ”. Меняет значение булевой переменной на противоположное
/**
public class Level_2 {
    public static void main(String[] args) {
        boolean x = true;
        System.out.println(!x); // false
    }
}
 */

// && — оператор “И”. Возвращает значение true только в том случае, если оба операнда являются true.
/**
public class Level_2 {
    public static void main(String[] args) {
        System.out.println(100 > 10 && 100 > 200); // false
        System.out.println(100 > 50 && 100 >= 100); // true
    }
}
// Результатом первой операции является false, поскольку одно из условий является ложным, а именно 100 > 200.
// Оператору && для того, чтобы вернуть true требуется, чтобы истинными были все условия (как во второй строке, например).
 */

// || — оператор “ИЛИ”. Возвращает true, когда хотя бы один из операндов истинный.
//
//Здесь наш предыдущий пример уже отработает по-другому:
/**
public class Level_2 {
    public static void main(String[] args) {
        System.out.println(100 > 10 || 100 > 200); // true
        System.out.println(100 > 200 || 100 >= 100); // true
    }
}
 // Выражение 100 > 200 по-прежнему ложно, но оператору “или” вполне достаточно, что первая часть (100 > 10) является истинной.
 */



