import java.util.Scanner ;
public class profitOrLoss {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter cost price : " ) ;
        int costPrice = n.nextInt() ;
        System.out.print("Enter selling price : " ) ;
        int sellingPrice = n.nextInt() ;

        if ( sellingPrice > costPrice ) {
            int profit = sellingPrice - costPrice ;
            System.out.println("Profit : " + profit ) ;
        }
        else {
            int loss = costPrice - sellingPrice ;
            System.out.println("Loss : " + loss ) ;
        }
    }
}