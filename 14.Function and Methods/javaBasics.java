//import java.util.*;

public class javaBasics{

    public static void printHelloWorld(){
        System.out.println("hello world");
    }

    public static void sum(int a,int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    //create a function for multiplication
    public static int multiplication(int a, int b){
        return a * b;
    }

    //factorial
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            
            fact = fact * i;
        }
        return fact;
        
    }

    //bionomial coefficient
    public static int bionomial_coefficient(int n, int r){
        
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);

        int bc = a / (b * c);

        return bc;

    }
    public static void main(String args[]){
        // printHelloWorld();
        // sum(4,5);
        //swap(2,3);
        // int fact1=factorial(4);
        // System.out.println(fact1);

        int C = bionomial_coefficient(5,4);
        System.out.println(C);

        //System.out.println(multiplication(4, 5));
    }
}