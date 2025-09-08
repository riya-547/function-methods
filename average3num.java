import java.util.*;
public class average3num {
    // public static int average(int a , int b , int c){
    //        int average = (a + b + c) / 3;
    //        return average;
    // }
    public static void main(String[] args) {
        // System.out.println( average(2,3,4));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the frist number : ");
        double x = sc.nextDouble();
        System.out.print("Enter the second number : ");
        double y = sc.nextDouble();
        System.out.print("Enter the third number : ");
        double z = sc.nextDouble();

        System.out.print("The average of the given number is : " + average( x , y , z) + "\n");

        
    }
    public static double average( double x , double y , double z){
        return ( x + y + z) / 3;
    }
}
