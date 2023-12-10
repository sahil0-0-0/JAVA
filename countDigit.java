import java.util.Scanner ;
public class countDigit {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter number : ") ;
        int num = n.nextInt() ;

        totalDigits(num) ;
    }

    public static void totalDigits ( int n1 ) {
        String newNum = Integer.toString(n1) ;
        int lenOfNum = newNum.length() ;
        System.out.print("Length of " + newNum  + " is " + lenOfNum) ;
    }
}