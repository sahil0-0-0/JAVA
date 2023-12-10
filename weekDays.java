import java.util.Scanner ;
public class weekDays {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter number of day between 1 to 7 : ") ;
        int num = n.nextInt() ;
        switch ( num ) {
            case 1 :
                System.out.print("The day is Sunday .") ;
                break ;
            case 2 :
                System.out.print("The day is Monday .") ;
                break ;
            case 3 :
                System.out.print("The day is Tuesday .") ;
                break ;
            case 4 :
                System.out.print("The day is Wednesday .") ;
                break ;
            case 5 :
                System.out.print("The day is Thursday .") ;
                break ;
            case 6 :
                System.out.print("The day is Friday .") ;
                break ;
            case 7 :
                System.out.print("The day is Saturday .") ;
                break ;
            default :
                System.out.print("Enter valid number !!") ;
                break ;
        }
    }
}