package kuntal.ojha;
// The target of the loop can be empty.
public class C5_Control_Statements_13_While_Loop {
    public static void main(String[] args) {
        int i,j;
        i=100;
        j=200;
        // find midpoint between i and j
        while (++i<--j); // no body in this loop
        System.out.println("Midpoint is "+i);
    }
}
