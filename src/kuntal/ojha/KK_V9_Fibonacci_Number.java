package kuntal.ojha;

import java.util.Scanner;

public class KK_V9_Fibonacci_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int a=0,b=1,sum = 0;
        for (int i = 2; i <=n; i++) {
            sum=a+b;
            a=b;
            b=sum;
        }
         System.out.println(sum);

    }
}
