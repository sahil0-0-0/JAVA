import java.util.Scanner ;
public class simpleInt {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter principal amount : ") ;
        double amt = n.nextDouble() ;
        System.out.print("Enter rate of interest ( in percentage ) : ") ;
        double roi = n.nextDouble() ;
        System.out.print("Enter time ( in year ) ") ;
        double time = n.nextDouble() ;

        double simInt = (double) ( amt * roi * time ) / 100 ;
        System.out.print("Simple interest : " + simInt ) ;
    }
}
