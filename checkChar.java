// Check if user input is only of one character , otherwise print " invalid input "
// by using built-in method String.length()
// Check input character is vowel or a constant

import java.util.Scanner ;
public class checkChar {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter character : " ) ;
        String c = n.nextLine() ;
        if ( c.length() == 1 ) {
            String newC = c.toLowerCase() ;
            if ( newC.equals("a") || newC.equals("e") || newC.equals("i") || newC.equals("o") || newC.equals("u") ) {
                System.out.print(newC + " is vowel ." ) ;
            }
            else {
                System.out.print(newC + " is constant . " ) ;
            }
        }
        else {
            System.out.print("Invalid") ;
        }
    }
}