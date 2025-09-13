public class armstrong{
    public static int count(int n){
        int k = 0;
        int numm = n;
        while( numm > 0){
            k++;
            numm /= 10;
        }
        return k;
    }

    public static boolean arm(int n){
        int k = count(n);
        int arms = 0 ;
        int num = n;
    
        while (n > 0 ){
        int ld = n % 10;
       
        arms += Math.pow(ld , k);
        n = n / 10;
        }
        // if(num == arms){
        //     return true;
        // }else{
        //     return false;
        // }
        return num == arms;
    }
public static void main(String[] args) {
    System.out.println(arm( 1634));
}
}