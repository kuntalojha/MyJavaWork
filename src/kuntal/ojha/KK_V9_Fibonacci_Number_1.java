package kuntal.ojha;

import java.util.Scanner;

public class KK_V9_Fibonacci_Number_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // |0|1|1|2|3|5|8|13|21|34|55|89|
        // |0|1|2|3|4|5|6|07|08|09|10|11|
        int n = input.nextInt();
        int a=0,b=1,sum = 0;
        int count=2;
        while (count<=n){
            sum = a+b;
            a = sum;
            count++;
        }
         System.out.println(sum);

    }
}
