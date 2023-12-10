import java.util.Scanner ;
public class lessThan5k {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter size : " ) ;
        int size = n.nextInt() ;
        int sum = 0 ;
        int num[] = new int[size] ;
        for ( int i = 0 ; i < size ; i++ ) {
            System.out.print("Enter number : ") ;
            num[i] = n.nextInt() ;
            sum += num[i] ;
            if ( sum >= 5000 ) {
                break;
            }
        }
        System.out.print("List of number : " ) ;
        for ( int i = 0 ; i < size ; i++ ) {
            System.out.print(num[i] + "," ) ;
        }
        System.out.println("");
        System.out.println("Sum : " + sum ) ;
    }
}