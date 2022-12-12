package kuntal.ojha;

import java.util.Scanner;

public class KK_V9_Largest_Number_04 {
    public static void main(String[] args) {
        // Q: Find the largest of the 3 numbers.
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Q: Find the largest of the 3 numbers.
        int Max = a;
        if(b>Max)
        {
            Max=b;
        }

        if(c>Max)
        {
            Max=c;
        }
        System.out.println(Max);

    }
}
