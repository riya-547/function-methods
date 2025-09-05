
import java.util.*;
public class binomialCoefficient {
    public static int factorial(int n){
        int fact = 1;
        for( int i = 1 ; i <= n ; i++){
             fact *= i;
        }
        return fact;
    }
    public static int binCoff(int n , int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nrfact = factorial(n - r);
        int bincof = nfact /( rfact  *  nrfact );
        return bincof;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print( "print value of n : ");
        int n = sc.nextInt();
          System.out.print( "print value of r : ");
        int r = sc.nextInt();
        System.out.println(binCoff(  n , r ));
        System.out.println(binCoff(  10 , 6 ));
      
        
    }
}


