import java.util.*;
public class evenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println("a is EVEN number.");
            System.out.println("a = "+a);
        }else{
            System.out.println("a is ODD number.");
            System.out.println("a = "+a);
        }
        sc.close();
    }
}
