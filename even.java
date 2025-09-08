public class even {
    
    public static boolean isEven( int num){
        if(num % 2 == 0){
            return true ;

        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        if(isEven(5)){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
       
    }
}


