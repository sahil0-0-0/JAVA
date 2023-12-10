import java.util.Scanner ;
public class employeeDestination {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.println("1. Engineer") ;
        System.out.println("2. Manager") ;
        System.out.println("3. Clerk") ;
        System.out.println("Enter any one of then for display gross salary .") ;
        String des = n.nextLine() ;
        switch (des) {
            case "Engineer" :
                int engBasic = 30000 ;
                int engHra = 2600 ;
                int engDa = 3000 ;
                int engGrossSalary = engBasic + engHra + engDa ;
                System.out.print("Gross salary of Engineer : " + engGrossSalary ) ;
                break ;
            case "Manager" :
                int manBasic = 40000 ;
                int manHra = 4600 ;
                int manDa = 2500 ;
                int manGrossSalary = manBasic + manHra + manDa ;
                System.out.print("Gross salary of Manager : " + manGrossSalary ) ;
                break ;
            case "Clerk" :
                int clBasic = 15000 ;
                int clHra = 1600 ;
                int clDa = 1500 ;
                int cleGrossSalary = clBasic + clHra + clDa ;
                System.out.print("Gross salary of Clerk : " + cleGrossSalary ) ;
                break ;
            default :
                System.out.print("Enter valid destination .") ;
        }
    }
}