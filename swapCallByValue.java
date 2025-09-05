public class swapCallByValue {
    public static void swap(int a , int b){
        // swap 
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a is after swaping : " + a); // 10 
          System.out.println("value of b is after swaping : " + b); // 5 
    }
    public static void main(String[] args) {

      /*  
          THIS IS NORMAL PROGRAM FOR SWAPING
      int a = 5;
        int b = 10;

        // swap 
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a is after swaping : " + a); // 10
          System.out.println("value of b is after swaping : " + b); // 5 

          */ 

          /* NOW WRITE THE PROGRAM OF SWAPING USING FUNCTIONS */

          int a = 5;
          int b = 10;
          System.out.println("value of a is after swaping : " + a); // 5
          System.out.println("value of b is after swaping : " + b); // 10
          swap(a , b);
           System.out.println("value of a is after swaping : " + a); // 5
          System.out.println("value of b is after swaping : " + b); // 10
          // when we pirnt value of a and b after the function call in main function they give actual values not the changable values because oc CALL BY VALUE ,(memory)
    }
}
