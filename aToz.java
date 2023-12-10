public class aToz {
    public static void main ( String[] args ) {
        printAtoZ();
    }
    public static void printAtoZ() {
       for ( char c = 'a' ; c <= 'z' ; c++ ) {
           System.out.print(c + " ") ;
       }
    }
}