import java.util.Scanner ;
public class ageDistribution {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter your age : " ) ;
        int age = n.nextInt() ;
        if ( age < 0 ) {
            System.out.print("Enter valid age !") ;
        }
        else if ( age <= 17 ) {
            System.out.print("Minor") ;
        }
        else if ( age <= 59 ) {
            System.out.print("Adult") ;
        }
        else {
            System.out.print("Citizen") ;
        }
    }
}
