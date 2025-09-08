public class decimalTObinary {
    //DECIMAL TO BINARY 
    public static void dectobin(int decNum){
        int power = 0;
        int binNum = 0;
        while(decNum > 0){
            int lastdigit = decNum % 2 ;
            binNum += lastdigit*(int)Math.pow(10 , power);
            power  ++;
            decNum = decNum / 2;
        }
        System.out.println(binNum);
    }
    public static void main(String[] args) {
        dectobin(6);
    }
}
