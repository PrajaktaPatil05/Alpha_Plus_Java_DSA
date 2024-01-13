import java.util.*;
public class print1toN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        System.out.println("1 to n numbers are as follows:");
        
        int i = 1;
        while(i<=n){
            
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}
