// simple 1D Array
// initialize values to int Array

public class inpArray {
    public static void main ( String[] args ) {
        int number[] = { 12 , 34 , 64 , 48 , 84 , 24 , 53 } ;
        for ( int num : number ) {
            System.out.println(num) ;
        }
    }
}


// initialize values on one by one index
/*
public class inpArray {
    public static void main ( String[] args ) {
        int num[] = new int[5] ;
        num[0] = 15 ;
        num[1] = 63 ;
        num[3] = 56 ;
        for( int n : num ) {
            System.out.println(n) ;
        }
    }
}

 */


// initialize values to String Array
/*
public class inpArray {
    public static void main ( String[] args ) {
        String name[] = { "sneha" , "isha" , "yogesh" , "harsh" } ;
        for( String n : name ) {
            System.out.println(n) ;
        }
    }
}
 */
// input String elements in Array
/*
import java.util.Scanner ;
public class inpArray {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter Array size : " ) ;
        int size = n.nextInt() ;
        String name[] = new String[size + 1] ;
        System.out.println("Enter Array elements : " ) ;
        for(int i=0 ; i<size + 1 ; i++ ) {
            name[i] = n.nextLine() ;
        }
        System.out.print("Array elements : " ) ;
        for( String s : name ) {
            System.out.println(s) ;
        }
    }
}
 */

// Get input in Array at runtime
/*
import java.util.Scanner ;
public class inpArray {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter size of Array : " ) ;
        int size = n.nextInt() ;
        int num[] = new int[size] ;
        System.out.println("Enter Array elements : " ) ;
        for(int i=0 ; i<size ; i++ ) {
            num[i] = n.nextInt() ;
        }
        System.out.println("Array elements : ") ;
        for(int i=0 ; i<size ; i++ ) {
            System.out.println(num[i]) ;
        }
    }
}

 */



