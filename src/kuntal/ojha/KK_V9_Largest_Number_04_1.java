package kuntal.ojha;

import java.util.Scanner;

public class KK_V9_Largest_Number_04_1 {
    public static void main(String[] args) {
        // Q: Find the largest of the 3 numbers.
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Q: Find the largest of the 3 numbers.
        int max=0;

        if(a > b) {
            max = a;
        } else {
            max = b;
        }

        if (c>max)
        {
            max =c;
        }
        System.out.println(max);
        System.out.println("\n");

        // OR we can do like this way.
        // Q: Find the largest of the 3 numbers.

        int maxNumber = Math.max(a, b);
        maxNumber = Math.max(maxNumber,c);
        System.out.println(maxNumber);


        int maxNum = Math.max(c, Math.max(a,b));
        System.out.println(maxNum+"\n");


    }
}
