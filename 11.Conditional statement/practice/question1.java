
package practice;
import java.util.*;
public class question1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        //ternary operator
        String type = (number > 0) ? "Positive" : "Negative";
        System.out.println(type);
        sc.close();
    }
    
}
