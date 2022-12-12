package kuntal.ojha;

//import java.util.Scanner;

public class KK_V7_Input_Output_07 {
    public static void main(String[] args) {
//        Scanner Input = new Scanner(System.in);

        // Type casting
        int number = (int) 99.99;
        System.out.println(number);

        // Automatic type promotion in expression
        int a = 257;
        // 257 % 256 = 1
        byte b = (byte) a; // byte can store 256
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = c*d/e; // here byte Automatically convert into int
        System.out.println(f);

        byte g = 50;
        // g = g * 2; we can't store int in byte.
        g = (byte) (g*20); // like this we convert
        System.out.println(g);

        // Automatically type conversion
        int number1 = 'A';
        System.out.println(number1); // 65 is the output, it's ASCII value of A is 65

        System.out.println(3*6);
        System.out.println(3*3.8765432f);

        byte h = 42;
        byte i = 'a';
        short j = 1024;
        int k = 50000;
        float l = 5.757f;
        double m = 0.76543;
        double result = ( l * h) + (k / i) - (m - j);
        System.out.println((l * h)+ " " + (k / i) + " " + (m - j));
        System.out.println(result);

    }
}
