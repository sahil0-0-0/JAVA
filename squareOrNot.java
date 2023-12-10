import java.util.Scanner ;
public class squareOrNot {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter length of rectangle : ") ;
        int length = n.nextInt() ;
        System.out.print("Enter width of rectangle : ") ;
        int width = n.nextInt() ;
        String result = ( length == width ) ? "it is square ."  : "it is not square" ;
        System.out.print(result) ;
    }
}
