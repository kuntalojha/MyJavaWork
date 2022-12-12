package kuntal.ojha;

import java.util.Scanner;

public class KK_V7_Input_Output_10_Temperature {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter temperature in C: ");
        float tempC = Input.nextFloat();

        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}
