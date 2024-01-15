

public class binaryToDecimal {

    public static void convertBinaryToDecimal(int binNum){
        int myNum = binNum;
        int decNum = 0;
        int pow = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + lastDigit * (int)Math.pow(2,pow);
            binNum = binNum / 10;
            pow++;
        }
        System.out.println("decimal num of " + myNum + " is: "+ decNum);
    }
    
    public static void main(String args[]){
        convertBinaryToDecimal(1011);
    }
}
