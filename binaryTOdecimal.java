public class binaryTOdecimal{
 // BINARY TO DECIMAL
    public static void bintodec(int n){
        int mynum = n;
      int pow = 0;
      int dec = 0;
      while(n > 0){
        int lastdigit = n % 10;
        dec = dec + ( lastdigit * (int)Math.pow(2, pow));
        pow ++ ;
        n = n / 10;
      }
      System.out.println("the decimal form of " + mynum + " is : " + dec);

    }
    public static void main(String[] args) {
       
         bintodec(101);
        
    }
}