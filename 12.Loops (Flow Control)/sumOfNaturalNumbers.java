import java.util.*;
public class sumOfNaturalNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        
        int sum = 0;

        System.out.println("The sum of 1 to " + n + " is : ");
        
        int i = 1;
        while(i<=n){
            sum = sum + i;
            i++;  
        }
        
        System.out.println(sum);

        sc.close();
    }
}
