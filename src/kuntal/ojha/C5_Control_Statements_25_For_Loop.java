package kuntal.ojha;

public class C5_Control_Statements_25_For_Loop {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int i = 0; i <10 ; i++) {
            sum+=nums[i];
            System.out.println("Sum= "+sum);
        }
        System.out.println("\nSum= "+sum);
    }
}
