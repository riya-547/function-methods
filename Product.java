
public class Product {
    public static int product(int a , int b){
          int pro = a * b;
          return pro;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 2 ;
        int pro = product(a , b);
        System.out.println("product of a and b is : " + pro);
         pro = product(10 , 10);
          System.out.println("product of a and b is : " + pro);
    }
}
