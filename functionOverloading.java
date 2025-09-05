public class functionOverloading { 
    // using parameters
    public static int sum( int a ,int b , int c){
         return a + b + c;
    }
     public static int sum( int a ,int b ){
         return a + b ;
    }
    // above both the funtions are of same name only the difference is that there are different number of parameters it is called function overloading


    //using dataypes
    public static float sum( float a ,float b , float c){
         return a + b + c;
    } 
    // above sum function is same and also there aree 3 parametrs but in first summ there is int datatype and in last there is float data type and it is also callled function overloading
     

    //SAME FUNCTION NAME - BUT DIFFERENT TYPE OF PARAMETERS OR DIFFRENT NUMBER OF PARAMETERS
    
    public static void main(String[] args) {
        System.out.println(sum(2,3,4));
         System.out.println(sum(2,3));
          System.out.println(sum(2.4f,3.6f,4.2f));
    }
}
