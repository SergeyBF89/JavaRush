//  Потоки делятся на два вида:
// Входящий поток (Input) — используется для приема данных
// Исходящий поток (Output) — для отправки данных.
// Входящий поток данных в Java реализован в классе InputStream, исходящий — в классе OutputStream.
//  System.out — поток для отправки данных на консоль, а System.in — для получения данных с клавиатуры. Все просто:)
//  Более того: чтобы считать данные с клавиатуры, мы можем обойтись без этой большой конструкции и написать просто: System.in.read();
//  В классе InputStream (а System.in, напомню, является объектом класса InputStream) есть метод read(), который позволяет считывать данные.

/**
public class Readers {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int x = System.in.read();
            System.out.println(x); // 208  175  10
        }
    }
 }
*/

// InputStreamReader, конечно, может читать данные не только из консоли, но и из других мест. Например, из файла:
 /**
public class Readers {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FilterInputStream("C:\\Users\\username\\Desktop\\testFile.txt"));

    }
}
*/

// Для чтения данных (неважно откуда, из консоли, файла или откуда-то еще) в классе InputStreamReader тоже используется метод read().
//
//В чем же разница между System.in.read() и InputStreamReader.read()?
//
//Давай попробуем считать ту же самую букву “Я” с помощью InputStreamReader.
/**
public class Readers {
     public static void main(String[] args) throws IOException {
         InputStreamReader reader = new InputStreamReader(System.in);
         while (true) {
             int x = reader.read();
             System.out.println(x); // 1071  10
         }
     }
}
// Разница видна сразу. Последний байт — для переноса строки — остался без изменений (число 10),
// а вот считанная буква “Я” была преобразована в единый код “1071”. Это и есть считывание по символам!
 */

// Если вдруг не веришь, что код 1071 обозначает букву “Я” — в этом легко убедиться:)
/**
public class Readers {
    public static void main(String[] args) throws IOException {
        char x = 1071;
        System.out.println(x); // Я
    }
}
 */

// BufferedReader при считывании данных использует специальную область — буфер, куда “складывает” прочитанные символы.
// В итоге, когда эти символы понадобятся нам в программе — они будут взяты из буфера,
// а не напрямую из источника данных (клавиатуры, файла и т.п.), а это экономит очень много ресурсов.
// Конструкторы:
//
//BufferedReader(Reader in) // Создает буферный поток ввода символов, который использует размер буфера по умолчанию.
//BufferedReader(Reader in, int sz) // Создает буферный поток ввода символов, который использует указанный размер.
// Методы:
//
//close() // закрыть поток
//mark(int readAheadLimit) // отметить позицию в потоке
//markSupported() // поддерживает ли отметку потока
//int read() // прочитать буфер
//int read(char[] cbuf, int off, int len) // прочитать буфер
//String readLine() // следующая строка
//boolean ready() // может ли поток читать
//reset() // сбросить поток
//skip(long n) // пропустить символы

// Пример использования классов BufferedReader и BufferedWriter:
//
//Чтения файла:
/**
public class Readers {
    public static void main(String[] args) throws IOException {
        String inputFileName = "file txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
        }
                catch (IOException e) {
            e.printStackTrace();
        }
    }

}
*/

// Конструкторы:
//
//BufferedWriter(Writer out) // Создает буферный поток вывода символов, который использует размер буфера по умолчанию.
//BufferedWriter(Writer out, int sz) // Создает буферный поток вывода символов, который использует указанный размер.
// Методы:
//
//close() // закрыть поток
//flush() // передать данные из буфера во Writer
//newLine() // перенос на новую строку
//write(char[] cbuf, int off, int len) // запись в буфер
//write(int c) // запись в буфер
//write(String s, int off, int len) // запись в буфер

// Запись в файл

/**
 public class Readers {
 public static void main(String[] args) throws IOException {
 String outputFileName = "file txt";;
        String[] array = { "one", "two", "three", "four" };
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String value : array) {
                writer.write(value + "\n");
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 */

// Считываем данные с консоли и записываем в файл:

/**
public class Readers {
    public static void main(String[] args) throws IOException {
        String outputFileName = "file txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader.readLine()).equals("exit")) { // Прерывание цикла при написании строки exit
                    writer.write(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/

// Главный плюс в том, что BufferedReader умеет читать данные не только по одному символу (хотя метод read()
// для этих целей у него тоже есть), а еще и целыми строками! Делается это с помощью метода readLine();
/**
public class Readers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку с клавиатуры: ");
        String s = reader.readLine();
        System.out.println(s);
    }
}
*/