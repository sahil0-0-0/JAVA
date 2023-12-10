import java.util.Scanner ;
public class avgOfThreeNum {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter 1st number : ") ;
        int num1 = n.nextInt() ;
        System.out.print("Enter 2nd number : ") ;
        int num2 = n.nextInt() ;
        System.out.print("Enter 3rd number : ") ;
        int num3 = n.nextInt() ;

        int sum = num1 + num2 + num3 ;
        int avg = sum / 3 ;

        System.out.print("Average of the given three number is " + avg ) ;
    }
}