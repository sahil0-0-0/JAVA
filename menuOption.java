import java.util.Scanner ;
public class menuOption {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;

        System.out.print("Enter 1st number : ") ;
        int num1 = n.nextInt() ;
        System.out.print("Enter 2nd number : ") ;
        int num2 = n.nextInt() ;
        System.out.println("Enter '+' for addition . ") ;
        System.out.println("Enter '-' for subtraction . ") ;
        System.out.println("Enter '*' for multiplication . ") ;
        System.out.println("Enter '/' for division . ") ;
        System.out.println("Enter '%' for modulo . ") ;

        System.out.print("Chose operation . ") ;
        char op = n.next().charAt(0) ;

        switch ( op ) {
            case '+' :
                int sum = num1 + num2 ;
                System.out.print("Addition : " + sum ) ;
                break ;
            case '-' :
                int sub = num1 - num2 ;
                System.out.print("Subtraction : " + sub ) ;
                break ;
            case '*' :
                int mul = num1 * num2 ;
                System.out.print("Multiplication : " + mul ) ;
                break ;
            case '/' :
                int div = num1 / num2 ;
                System.out.print("Division : " + div ) ;
                break ;
            case '%' :
                int mod = num1 % num2 ;
                System.out.print("Modulo : " + mod ) ;
                break ;
            default :
                System.out.print("perform valid operation  .") ;
                break ;
        }
    }
}