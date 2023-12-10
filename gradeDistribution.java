import java.util.Scanner ;
public class gradeDistribution {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter marks 1 : " ) ;
        int m1 = n.nextInt() ;
        System.out.print("Enter marks 2  : " ) ;
        int m2 = n.nextInt() ;
        System.out.print("Enter marks 3 : " ) ;
        int m3 = n.nextInt() ;

        int totalMarks = m1 + m2 + m3 ;
        int percentage = totalMarks / 3 ;
        System.out.println("Total marks : " + totalMarks ) ;
        System.out.println("Percentage : " + percentage ) ;

        switch ( percentage / 10 ) {
            case 10 :
            case 9 :
            case 8 :
            case 7 :
                System.out.print("Grade : Distinction") ;
                break ;
            case 6 :
                System.out.print("Grade : First Class") ;
                break ;
            case 5 :
                System.out.print("Grade : Second class") ;
                break ;
            case 4 :
                System.out.print("Grade : Pass Class") ;
                break ;
            case 3 :
            case 2 :
            case 1 :
                System.out.print("Grade : Fail") ;
                break ;
            default :
                System.out.print("Enter correct marks !! ") ;
        }
    }
}