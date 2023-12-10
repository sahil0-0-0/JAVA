import java.util.Scanner ;
public class arithmaticOperation {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter 1st number : " ) ;
        int num1 = n.nextInt() ;
        System.out.print("Enter 2nd number : " ) ;
        int num2 = n.nextInt() ;

        System.out.println("1. Addition ") ;
        System.out.println("2. Subtraction ") ;
        System.out.println("3. Multiplication ") ;
        System.out.println("4. Division ") ;
        System.out.println("Enter number of the operation which you want to perform : ") ;
        int opr = n.nextInt() ;

        int add = num1 + num2 ;
        int sub = num1 - num2 ;
        int mul = num1 * num2 ;
        int div = num1 / num2 ;

        switch(opr) {
            case 1 :
                System.out.print("Addition : " + add ) ;
                break ;
            case 2 :
                System.out.print("Subtraction : " + sub ) ;
                break ;
            case 3 :
                System.out.print("Multiplication : " + mul ) ;
                break ;
            case 4 :
                System.out.print("Division : " + div ) ;
                break ;
            default :
                System.out.print("Invalid number !!") ;
                break ;
        }
    }
}
