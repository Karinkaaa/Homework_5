package abstractDemo.mainClass;

import abstractDemo.extendsClasses.LowerStringPrinter;
import abstractDemo.extendsClasses.UpperStringPrinter;

import java.util.Scanner;

public class StringPrinterDemo {
    public static void main(String[] args) {

        /* Создать абстрактный класс AbstractStringPrinter c методом abstract void print(String str);
        - создать реализации:
            UpperStringPrinter - печатать все символы upper case (в классе String метод toUpperCase);
            LowerStringPrinter - печатать все символы lower case (в классе String метод toLowerCase).
        Создать класс StringPrinterDemo с методом UsingInterfaces:
        - вывести на консоль: "Please enter some string";
        - считать строку с консоли
        - вывести на консоль: "Please enter string printer type (U - upper, L - lower)";
        - считать тип;
        - в зависимости от введенного типа воспользоваться конкретной реализацией AbstractStringPrinter. */

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter some string: ");
        String str = in.nextLine();
        System.out.print("Please enter string printer type (U - upper, L - lower): ");
        String strPrinter = in.nextLine();

        if (strPrinter.equals("U")) {
            UpperStringPrinter upper = new UpperStringPrinter();
            upper.print(str);
        } else if (strPrinter.equals("L")) {
            LowerStringPrinter lower = new LowerStringPrinter();
            lower.print(str);
        } else {
            System.out.println("Incorrect data!");
        }
    }
}
