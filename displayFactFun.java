import java.util.Scanner ;
public class displayFactFun {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter number : " ) ;
        int num = n.nextInt() ;
        displayFactorial(num) ;
    }
    public static void displayFactorial ( int no ) {
        int fact = 1 ;
        for ( int i = 1 ; i <= no ; i++ ) {
            fact = fact * i ;
        }
        System.out.print("Factorial : " + fact ) ;
    }
}