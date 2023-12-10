import java.util.Scanner ;
public class inpUsLoop {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.println("Enter 5 numbers : ") ;
        double sum = 0 ;
        for ( int i = 1 ; i <= 5 ; i++ ) {
            double num = n.nextDouble() ;
            sum += num ;
        }
        System.out.println("Sum : " + sum ) ;
        double avg = sum / 5 ;
        System.out.println("Average : " + avg ) ;
    }
}
