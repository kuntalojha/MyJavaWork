package kuntal.ojha;

import java.util.Scanner;

public class KK_V9_Largest_Number_04_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Q: Find the largest of the 3 numbers.
        System.out.println(Math.max(c,(Math.max(a,b))));
    }
}
