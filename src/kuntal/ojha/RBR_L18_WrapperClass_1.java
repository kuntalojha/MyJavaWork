package kuntal.ojha;


import java.util.Scanner;

public class RBR_L18_WrapperClass_1 {
    public static void main(String[] args) {
        Scanner kuntal = new Scanner(System.in);
        // primitive data types
        int my_gate_score=01;
        // Using Wrapper Classes
        Integer my_wrapped_gate_score =Integer.valueOf(my_gate_score);
        System.out.println(my_gate_score);
        System.out.println(my_wrapped_gate_score);
    }
}
