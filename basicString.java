// initialize String value .
/*
public class basicString {
    public static void main(String[] args) {
        String s = "how are you ?";
        System.out.print(s);
    }
}
 */

// Get String value at runtime from user
import java.util.Scanner ;
public class basicString {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter String : " ) ;
        String s = n.nextLine() ;
        System.out.print(s) ;
    }
}