import java.util.Scanner ;
public class checkTriangle {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter 1st angle : " ) ;
        int ang1 = n.nextInt() ;
        System.out.print("Enter 2nd angle : " ) ;
        int ang2 = n.nextInt() ;
        System.out.print("Enter 3rd angle : " ) ;
        int ang3 = n.nextInt() ;

        int sum = ang1 + ang2 + ang3 ;

        if ( sum == 180 ) {
            System.out.print("it is valid triangle . " ) ;
        }
        else {
            System.out.print("it is invalid triangle . " ) ;
        }
    }
}