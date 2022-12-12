package kuntal.ojha;

import java.util.Scanner;

public class KK_V9_while_Loop_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n =in.nextInt();

        // while loop
        /*
            Syntax:
            while (condition) {
                // body
            }
         */

        // for loop

        /*
            for(int number = 1; number <= 5; number++) {
                System.out.println(number);
            }
        */
        System.out.println("I am while loop");
        int number = 1;
        while (number <= 5) {
            System.out.println(number);
            number++;
        }

        // do while loop

        /*
            do {
                // body
            } while(condition);
         */

        System.out.println("\nI am do while loop");
        int n=1;
        do {
            System.out.println(n);
            n++;
        }while (n <= 5);

        System.out.println("\nI am also in do while loop");
        n=1;
        do {
            System.out.println("Hello World!\nFrom do while loop.");
        }while (n != 1);

    }
}
