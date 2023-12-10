import java.util.Scanner ;
public class switchOperation {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter number : ") ;
        int num = n.nextInt() ;
        System.out.println("1. Display the square of the number .") ;
        System.out.println("2. Display the cube of the nuber . ") ;
        System.out.println("3. Check if number is even or odd . ") ;
        System.out.println("4. Increment operation . ") ;
        System.out.println("5. Decrement operation . ") ;
        int choice = n.nextInt() ;
        switch (choice) {
            case 1 :
                int sqr = num * num ;
                System.out.print("Square : " + sqr ) ;
                break ;
            case 2 :
                int cube = num * num * num ;
                System.out.print("Cube : " + cube ) ;
                break ;
            case 3 :
                if ( num % 2 == 0 ) {
                    System.out.print(num + " is even ." ) ;
                }
                else
                {
                    System.out.print(num + " is odd " ) ;
                }
                break ;
            case 4 :
                num += 1 ;
                System.out.print("Number after increment : " + num ) ;
                break ;
            case 5 :
                num -= 1 ;
                System.out.print("Number after Decrement : " + num ) ;
                break ;
        }
    }
}