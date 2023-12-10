// using for loop
import java.util.Scanner ;
public class table {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter number : " ) ;
        int num = n.nextInt() ;
        for ( int i = 1 ; i<=10 ; i++ ) {
            System.out.println(num + " x " + i + " = " + num*i) ;
        }
    }
}
// using while loop
/*
import java.util.Scanner ;
public class table {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter number : " ) ;
        int num = n.nextInt() ;
        int i = 1 ;
        while ( i <= 10 ) {
            System.out.println(num + " x " + i + " = " + num*i) ;
            i++ ;
        }
    }
}
*/