// find out factorial

// using for loop
/*
import java.util.Scanner ;
public class findFactorial {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter number : " ) ;
        int num = n.nextInt() ;
        int fact = 1 ;
        for ( int i=1 ; i<=num ; i++ ) {
            fact = fact * i ;
        }
        System.out.print("Factorial of " + num + " is " + fact + ".") ;
    }
}
*/

// using while loop
import java.util.Scanner ;
public class findFactorial {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter number : " ) ;
        int num = n.nextInt() ;
        int i = 1 , fact = 1 ;
        while( i<=num ) {
            fact = fact * i ;
            i++ ;
        }
        System.out.print("Factorial of " + num + " is " + fact + ".");
    }
}