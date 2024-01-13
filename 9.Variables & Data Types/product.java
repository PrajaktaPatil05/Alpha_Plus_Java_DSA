import java.util.*;
public class product {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float product = a * b;
        System.out.println("Product of two numbers is: "+product);
        sc.close();
    }
}
