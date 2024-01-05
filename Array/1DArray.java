import java.util.Scanner ;
public class Demo {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        int[] arr = new int[3] ;
        System.out.println("Enter array elements : " ) ;
        for ( int i = 0 ; i < 3 ; i++ ) {
            System.out.print( i + " index : " );
            arr[i] = n.nextInt() ;
        }
        System.out.println("Array elements : " ) ;
        for ( int i = 0 ; i < 3 ; i++ ) {
            System.out.print( i + " index : " ) ;
            System.out.println(arr[i]);
        }
    }
}
