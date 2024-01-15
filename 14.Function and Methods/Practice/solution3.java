import java.util.*;
public class solution3 {
    
    public static boolean isPalindrome(int num){
        int myNum = num;
        int newNum = 0;
        while(num != 0){
            int rem = num % 10;
            newNum = newNum * 10 + rem;
            num = num / 10;

            if(myNum == newNum){
                return true;
            }  
        }
        return false;
    }

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(isPalindrome(x));
        sc.close();
    }
}
