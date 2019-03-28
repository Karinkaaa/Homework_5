package staticDemo.mainClass;

import staticDemo.staticClasses.IntUtils;

import java.util.Scanner;

public class UsingStatics {
    public static void main(String[] args) {

        /* Реализовать класс IntUtils. Сделать его конструктор приватным, реализовать в этом классе
        статические методы:
        - static int plus(int a, int b);
        - static int minus(int a, int b);
        - static int pow(int number, int pow);   //возведение в степень
        - static int getRandomInt(int minBound, int maxBound);  */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = in.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = in.nextInt();

        System.out.println("\n" + firstNum + " + " + secondNum + " = " + IntUtils.plus(firstNum, secondNum));
        System.out.println("\n" + firstNum + " - " + secondNum + " = " + IntUtils.minus(firstNum, secondNum));
        System.out.println("\n" + firstNum + " in pow " + secondNum + " = " + IntUtils.pow(firstNum, secondNum));
        System.out.println("\nRandom value from " + firstNum + " to " + secondNum + " = " +
                IntUtils.getRandomInt(firstNum, secondNum));
    }
}