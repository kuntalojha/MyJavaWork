package kuntal.ojha;

import java.util.Scanner;

public class KK_V7_Input_Output_05 {
    public static void main(String[] args) {
        Scanner useForInput = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = useForInput.next(); // If you give input then also output only your first name. Because of next();
        System.out.println("Your name is " + name);

        System.out.println("Sorry !, for previous mistake.\nPlease enter your name:");
        String newName = useForInput.nextLine();
        System.out.println("Hi," + newName + " Good morning");

    }
}
