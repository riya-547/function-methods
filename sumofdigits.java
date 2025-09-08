import java.util.*;
public class sumofdigits {
    public static int sum(int number){
        int sum = 0;
        while (number > 0){
            int lastdigit = number % 10;
            sum += lastdigit;
            number = number/ 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : " );
        int number = sc.nextInt();
        System.out.println(" the sum of " + number + " each digit in an integer is : " + sum(number));


    }
}


