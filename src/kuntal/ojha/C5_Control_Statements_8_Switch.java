package kuntal.ojha;
// An improved version of the season program
public class C5_Control_Statements_8_Switch {
    public static void main(String[] args) {
        int month=4;
        String season;
        switch (month){
            case 12:
            case 1:
            case 2:
                season="Winter";
                break;
            case 3:
            case 4:
            case 5:
                season="Spring";
                break;
            case 6:
            case 7:
            case 8:
                season="Summer";
                break;
            case 9:
            case 10:
            case 11:
                season="Autumn";
            default:
                season="Bogus Month";
        }
        System.out.println("April is the "+season+".");
    }
}
