import java.util.Scanner;

// Сканер целых чисел
/**
 public class Level_1 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Введите число: ");
 if (scanner.hasNextInt()) {
 int number = scanner.nextInt();
 System.out.println("вы ввели число - " + number);
 } else {
 System.out.println("Вы ввели не правильное значение!");
 scanner.close();
 }
 }
 }
 */

// Метод разделения useDelimiter
/**
 public class Level_1 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner("На голой ветке'" +
 "Ворон сидит одиноко'" +
 "Осенний вечер." +
 "''***''" +
 "В небе такая луна,'" +
 "Словно дерево спиленно под корень:'" +
 "Белеет свежий срез.'" +
 "''***''" +
 "Как разлелась река!'" +
 "Цапля бредет на коротких ножках,'" +
 "По колено в воде.");
 scanner.useDelimiter("'");
 while (scanner.hasNext()) {
 System.out.println(scanner.next());
 }
 scanner.close();
 }
 }
 */

// Напиши программу, которая выводит на экран надпись: "Амиго очень умный".
/**
 public class Level_1 {
 public static void main(String[] args) {
 System.out.println("Амиго очень умный");
 }
 }
 */

// Напиши программу, которая выводит на экран надпись: Я думаю, быть программистом круто
/**
 public class Level_1 {
 public static void main(String[] args) {
 System.out.println("Я думаю, быть программистом круто");
 }
 }
 */

// Напиши программу, которая в методе main объявляет такие переменные:
//name типа String, age типа int и city типа String.
/**
 public class Level_1 {
 public static void main(String[] args) {
 String name;
 int age;
 String city;
 }
 }
 */

// Объяви переменные a, b типа int.
//Сразу же в строке объявления присвой им разные значения.
//Значениями могут быть любые целые числа
/**
 public class Level_1 {
 public static void main(String[] args) {
 int a = 5;
 int b = 8;
 }
 }
 */

// Сейчас 3126 год. Мой друг родился 8 лет назад.
//Написать программу, выводящую на экран год рождения моего друга.
/**
 public class Level_1 {
 public static void main(String[] args) {
 System.out.println("3118"); // правельный вариант по решению задания
 int year = 3126; // моё баловство)
 int yearBirth = year - 8;
 System.out.println(yearBirth);
 }
 }
 */
