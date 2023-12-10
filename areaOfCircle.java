// find out Area of circle and circumference
// Area of circle = πr²
// circumference = 2πr

import java.util.Scanner ;
public class areaOfCircle {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter value of radius : " ) ;
        int r = n.nextInt() ;
        float afc = ( float ) ( 3.14 * r * r ) ;
        System.out.println("Area of Circle : " + afc ) ;
        float cf = ( float ) ( 2 * 3.14 * r ) ;
        System.out.print("Circumference : " + cf ) ;
    }
}