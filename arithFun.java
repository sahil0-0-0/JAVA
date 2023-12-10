import java.util.Scanner ;
public class arithFun {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter first number : ") ;
        int n1 = n.nextInt() ;
        System.out.print("Enter second number : ") ;
        int n2 = n.nextInt() ;
        System.out.print("Enter operator : " ) ;
        char op = n.next().charAt(0) ;

        arithMeticOp( n1 , n2 , op ) ;
    }

    public static void arithMeticOp ( int num1 , int num2 , char opr ) {
        switch ( opr ) {
            case '+' :
                int sum = num1 + num2 ;
                System.out.print(sum) ;
                break ;
            case '-' :
                int sub = num1 - num2 ;
                System.out.print(sub) ;
                break ;
            case '*' :
                int mul = num1 * num2 ;
                System.out.print(mul) ;
                break ;
            case '/' :
                int div = num1 / num2 ;
                System.out.print(div) ;
                break ;
            default :
                System.out.print("Enter valid operator .") ;
        }
    }
}