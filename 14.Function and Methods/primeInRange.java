public class primeInRange {

    public static boolean checkPrime(int n){
        for(int i = 2; i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }

        }
        return true;
    }

    public static void primeRange(int range){
        
        for(int i = 2; i <= range; i++){
            
            if(checkPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
    }
    public static void main(String args[]){
        primeRange(100);
    }
}
