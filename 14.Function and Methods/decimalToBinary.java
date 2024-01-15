public class decimalToBinary {
    
    public static void decToBinConversion(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum > 0){
            
            int remainder = decNum % 2;
            decNum = decNum / 2;

            binNum = binNum + (remainder * (int)Math.pow(10,pow));
            pow++;
        }

        System.out.println("Binary number of "+ myNum +" is: "+ binNum);
    }   

    public static void main(String args[]){
        decToBinConversion(15);
    }
}
