// find max age from 3 ages using nested if
/*
import java.util.Scanner ;
public class maxFrom3Num {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter 1st number : ") ;
        int num1 = n.nextInt() ;
        System.out.print("Enter 2nd number : " ) ;
        int num2 = n.nextInt() ;
        System.out.print("Enter 3rd number : " ) ;
        int num3 = n.nextInt() ;
        if ( num1 > num2 ) {
            if ( num1 > num3 ) {
                System.out.print(num1 + " is max .") ;
            }
        }
        else if ( num2 > num3 ) {
            System.out.print(num2 + " is max . ") ;
        }
        else {
            System.out.print(num3 + " is max . ") ;
        }
    }
}
*/

// find max age logical operator
import java.util.Scanner ;
public class maxFrom3Num {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter 1st number : ") ;
        int num1 = n.nextInt() ;
        System.out.print("Enter 2nd number : " ) ;
        int num2 = n.nextInt() ;
        System.out.print("Enter 3rd number : " ) ;
        int num3 = n.nextInt() ;
        if ( num1 > num2 && num1 > num3 ) {
            System.out.print(num1 + " is max ") ;
        }
        else if ( num2 > num3 ) {
            System.out.print(num2 + " is max ") ;
        }
        else {
            System.out.print(num3 + " is max ") ;
        }
    }
}
