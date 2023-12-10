import java.util.Scanner ;
public class fullName {
    public static void main ( String[] args ) {
        Scanner c = new Scanner ( System.in ) ;
        System.out.print("Enter first name : " ) ;
        String firstName = c.nextLine() ;
        System.out.print("Enter last name : " ) ;
        String lastName = c.nextLine() ;
        String fName = firstName.concat(" ").concat(lastName) ;
        System.out.print("Your full name is " + fName ) ;
    }
}