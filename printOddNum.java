import java.util.Scanner ;
public class printOddNum {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter number : ") ;
        int num = n.nextInt() ;
        System.out.println("Odd numbers :") ;
        for ( int i=1 ; i<=num ; i+=2 ) {
            System.out.println(i) ;
        }
    }
}