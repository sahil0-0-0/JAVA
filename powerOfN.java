/*
import java.util.Scanner ;
public class powerOfN {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        int result = 1 ;
        System.out.print("Enter number : " ) ;
        int num = n.nextInt() ;
        System.out.print("Enter value power : " ) ;
        int pow = n.nextInt() ;
        for ( int i = 1 ; i <= pow ; i++ ) {
            result *= num ;
        }
        System.out.print(result) ;
    }
}
 */

// using Math.pow() function

import java.util.Scanner ;
public class powerOfN {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter number : " ) ;
        int num = n.nextInt() ;
        System.out.print("Enter value power : " ) ;
        int pow = n.nextInt() ;
        double result = Math.pow(num,pow) ;
        System.out.print(result) ;
    }
}