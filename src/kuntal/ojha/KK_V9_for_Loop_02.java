package kuntal.ojha;

import java.util.Scanner;

public class KK_V9_for_Loop_02 {
    public static void main(String[] args) {
        /*
            Syntax of for loops:

            for(initialisation; condition; increment/decrement) {
                // body
            }
         */

        // Q: Print number from 1 to 5
        for (int number = 1; number <= 5 ; number++) {
            System.out.println(number);
        }

        // Q: Print number from 1 to n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.print(num +" ");
        }

    }

}
