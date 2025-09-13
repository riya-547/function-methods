public class allfactors {
    public static void factors(int n){
        for(int i = 1 ; i <= Math.sqrt(n) ; i++) {
            if( n % i == 0){
                System.out.println(i);
                int f =  (n / i) ;
                if(f != i){
                     System.out.println(f);
                }
            }
        }
    }
    public static void main(String[] args) {
        factors(36);
    }
}
