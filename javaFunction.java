// without parameters
/*
public class javaFunction {
    public static void main ( String[] args ) {
        printHello() ;
    }
    static void printHello() {
        System.out.print("Hello world") ;
    }
}
 */

// single parameter
/*
public class javaFunction {
    public static void main ( String[] args ) {
        table(15) ;
    }
    static void table ( int n ) {
        for ( int i = 1 ; i <= 10 ; i++ ) {
            System.out.println( n + " x " + i + " = " + i * n ) ;
        }
    }
}
*/




// multiple parameters
public class javaFunction {
    public static void main ( String[] args ) {
        addition( 12 , 34 ) ;
    }
    static void addition( int a , int b ) {
        int sum = ( (int) a + (int) b ) ;
        System.out.print("Addition : " + sum ) ;
    }
}




