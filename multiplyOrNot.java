import java.util.Scanner ;
public class multiplyOrNot {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter number : " ) ;
        int num = n.nextInt() ;
        System.out.print("Enter number to check multiple or not : ") ;
        int chackNum = n.nextInt() ;
        if ( chackNum < num ) {
            if ( num % chackNum == 0 ) {
                System.out.print( chackNum + " is a multiple of " + num + "." ) ;
            }
            else {
                System.out.print( chackNum + " is a not multiple of " + num + "." ) ;
            }
        }
        else if ( chackNum % num == 0 ) {
            System.out.print(chackNum + " is a multiple of " + num + "." ) ;
        }
        else {
            System.out.print(chackNum + " is a not multiple of " + num + "." ) ;
        }
    }
}