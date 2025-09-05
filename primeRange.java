public class primeRange {
    public static boolean isprime(int n){
if( n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n) ; i ++){
            if(n % i == 0){
                return false;
            }
            
        }
        return true;
    }
      
    
    public static void primerange(int n) {
        
           for( int i = 2 ; i <= n ; i++){
            //   boolean yes = isprime(i);
            //  if(yes == true){
            //     System.out.println(i);
            if(isprime(i)){
                System.out.print(i + " ");
            }
             }
    }
    
    
    public static void main(String[] args) {
        primerange(20);
    }
}
