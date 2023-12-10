import java.util.Scanner ;
public class leapOrNot {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter year : ") ;
        int year = n.nextInt() ;
        if ( year % 4 == 0 ) {
            System.out.print(year + " is leap year . ") ;
        }
        else {
            System.out.print(year + " is not leap year . ") ;
        }
    }
}
