// solution 1
// using 3rd variable
/*
import java.util.Scanner ;
public class swapping {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter 1st number : ") ;
        int num1 = n.nextInt() ;
        System.out.print("Enter 2nd number : ") ;
        int num2 = n.nextInt() ;
        int temp = 0  ;

        temp = num1 ;
        num1 = num2 ;
        num2 = temp ;
        System.out.println("Number after swapping :-") ;
        System.out.println("1st number : " + num1);
        System.out.println("2nd number : " + num2);
    }
}
 */

// solution 2
// without using 3rd variable

import java.util.Scanner ;
public class swapping {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter 1st number : ") ;
        int num1 = n.nextInt() ;
        System.out.print("Enter 2nd number : " ) ;
        int num2 = n.nextInt() ;

    //    using + and - operator

    //    num1 = num1 + num2 ;
    //    num2 = num1 - num2 ;
    //    num1 = num1 - num2 ;

    // using exponent operator

        num1 = num1 ^ num2 ;
        num2 = num1 ^ num2 ;
        num1 = num1 ^ num2 ;

        System.out.println("Numbers after Swapping :- ") ;
        System.out.println("1st number : " + num1 ) ;
        System.out.println("2nd number : " + num2 ) ;
    }
}