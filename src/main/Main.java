import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //FirstTask
        String firstName = "Vladislav";
        String lastName = "Shakhov";
        String profession = "QA engineer";

        System.out.println("My name is " + firstName);
        System.out.println("My last name is " + lastName);
        System.out.println("My profession is " + profession);

        //SecondTask
        byte byteVar = 100;
        short shortVar = 10000;
        int intVar = 100000;
        long longVar = 100000L;

        float floatVar = 10.5f;
        double doubleVar = 20.99;

        char charVar = 'A';

        boolean booleanVar = true;

        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + booleanVar);

        //ThirdTask
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String input = scanner.nextLine();

        System.out.println("Text: " + input);

        System.out.println("Длина строки: " + input.length());
        System.out.println("Строка в верхнем регистре: " + input.toUpperCase());
        System.out.println("Строка в нижнем регистре: " + input.toLowerCase());
        System.out.println("Первый символ: " + input.charAt(0));
        System.out.println("Последний символ: " + input.charAt(input.length() - 1));
        System.out.println("Подстрока (с 0 по 4): " + input.substring(0, Math.min(input.length(), 5)));
        System.out.println("Индекс символа 'a': " + input.indexOf('a'));
        System.out.println("Содержит 'текст': " + input.contains("текст"));
        System.out.println("Заменить 'текст' на 'замененный': " + input.replace("текст", "замененный"));
        System.out.println("Строка без пробелов: " + input.replace(" ", ""));

        scanner.close();
    }
}
