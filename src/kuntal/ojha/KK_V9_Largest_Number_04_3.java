package kuntal.ojha;

import java.util.Scanner;

public class KK_V9_Largest_Number_04_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }
    }
}
