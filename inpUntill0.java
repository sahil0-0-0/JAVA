import java.util.Scanner ;
import java.util.ArrayList ;

public class inpUntill0 {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        ArrayList<Integer> ar = new ArrayList<Integer>() ;
        int num = 1 ;
        do {
            System.out.print("Enter number : ") ;
            num = n.nextInt() ;

            if ( num != 0 ) {
                ar.add(num) ;
            }
        } while ( num != 0 ) ;

        System.out.print(ar) ;
    }
}