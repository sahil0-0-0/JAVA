import java.util.Scanner ;
public class voteFun {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter user name : " ) ;
        String usrName = n.nextLine() ;
        System.out.print("Enter country name : " ) ;
        String con = n.nextLine() ;
        System.out.print("Enter age : " ) ;
        int age = n.nextInt() ;

        eligibleForVote( usrName , con , age  ) ;
    }

    public static void eligibleForVote ( String un , String c , int ag ) {
        if ( ag > 18 ) {
            System.out.println("Hello " + un + " from " + c +  ", you're eligible to vote !") ;
        }
        else {
            System.out.println("Hello " + un + " from " + c +  ", you're not eligible to vote !") ;
        }
    }
}