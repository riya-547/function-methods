
import java.util.*;public class funSyntax { // class
  // function inside the class is called method only term is change  
    public static void printHeelo(){
        System.out.println("hello world");
         System.out.println("hello world");
          System.out.println("hello world");
           System.out.println("hello world");
          // return ;  // for void its not necessary to write return but for other return type we have to write return for example if we haive in return type then at the end of the function or method we have to write return aith some integer value
}
              public static void calculateSum(){
             Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is :" + sum);
    }
    public static void main(String[] args){
       calculateSum();
      printHeelo(); // function call
    }
}
