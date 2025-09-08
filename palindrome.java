import java.util.*;
public class palindrome {
    public static void main(String[] args) {
    //  Scanner sc = new Scanner(System.in);
    //  System.out.print("Enter the minimum 3 digits number : " );
    //  int num = sc.nextInt();
    //    if( sameAsNum(num) == num ){
    //      System.out.println("The " + num + " is palindrome because its reverse is : " + sameAsNum(num) + " same as the given number");
    //    }else{
    //     System.out.println("The given number is not plaindrome because its reverse is " + sameAsNum(num) + " which is not same as the given number " + num);
    //    }
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter the minimum 3 digits number : " );
      int num = sc.nextInt();
      if(sameAsNum(num)){
        System.out.println(" the number "+ num + " is palindrome because its reverse is same");
      }else{
        System.out.println(" the number is not plaindrome");
      }
    }
    public static boolean sameAsNum(int num){
        // int reverse = 0;
        // while(num > 0 ){
        //     int lasstdigit = num % 10;
        //  reverse = (reverse * 10) + lasstdigit;
        //  num = num / 10;

        // }
        // // System.out.println(reverse);
        // return reverse;
     int plaindrome = num;
         int reverse = 0;
         while (plaindrome >  0){
            int lasstdigit = plaindrome % 10;
          reverse = (reverse * 10) + lasstdigit;
          plaindrome = plaindrome / 10;
            
         }
         System.out.println(plaindrome);
         if(num == reverse){
            return true;
         }else{
            return false;
         }
    }
}
