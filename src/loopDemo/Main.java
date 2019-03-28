package loopDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Пользователь вводит число с консоли. Определить сколько делителей без остатка имеет число (к примеру,
         введено число 8 - количество делителей 1, 2, 4, 8). */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.println("\nCount dividers of the number " + num + " = " + getCountOfDividers(num));
    }

    public static int getCountOfDividers(int num) {
        int count = 0;
        for (int i = 1; i <= Math.abs(num); i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
