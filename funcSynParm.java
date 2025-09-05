import java.util.*;

public class funcSynParm {
     public static int calculateSum(int num1 , int num2){  //here num 1 and num 2 are         parametrs or formal parameters
        
        
        // inputs are parameters we also change parmeter name dissre than arguments or scanner name just like we did in arguments we have a and b and in paramets we take input a as parm num 1 and input b as parm num2 output is same
             
        int sum = num1 + num2;
        return sum;
      
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
      int sum =  calculateSum( a , b);   // here a and b inside the function call  that is between parenthesis are call arguments or actual parameters
        
      // both variables sum are diiferent because of scope bcoz the declare in different functions
         System.out.println("sum is : " + sum);
    
}
}