public class calculator {
    //function overloading = class name same parameters different
    public static int sum(int a,int b){
        return a+b;
    }

    public static boolean checkPrime(int n) {
        // 0 and 1 are not prime numbers
        if (n <= 1) {
            return false;
        }
    
        // Check for divisibility by numbers from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // If n is divisible by any number in this range, it's not prime
                return false;
            }
        }
    
        // If no divisors are found, n is a prime number
        return true;
    }
    

    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        // int add=sum(2,3);
        // int addition=sum(2,3,5);
        // System.out.println(add);
        // System.out.println(addition);
        System.out.println(checkPrime(49999));
    }   
}
