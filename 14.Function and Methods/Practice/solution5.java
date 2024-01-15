import java.util.*;
public class solution5 {
    
    public static void sumOfDigits(int number){
        int myNum = number;
        int rem = 0;
        int sum = 0;

        while(number != 0){
            rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }

        System.out.println("Sum of Digits of number "+ myNum + " is:" + sum);
    }
    public static void main(String args[]){
        // sumOfDigits(1234);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        sumOfDigits(a);

        sc.close();
    }
}
