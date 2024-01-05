import java.util.Scanner ;
public class Demo {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        int[][] arr = new int[3][3] ;
        System.out.println("Enter Elements : " );
        for ( int i=0 ; i<3 ; i++ ) {
            for ( int j=0 ; j<3 ; j++ ) {
                arr[i][j] = n.nextInt() ;
            }
        }
        System.out.println("Matrix : " ) ;
        for ( int i=0 ; i<3 ; i++ ) {
            for ( int j=0 ; j<3 ; j++ ) {
                System.out.print(arr[i][j] + " " ) ;
            }
            System.out.println(" ") ;
        }
    }
}
