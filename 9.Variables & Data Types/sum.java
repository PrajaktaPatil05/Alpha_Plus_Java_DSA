import java.util.Scanner;

public class sum {
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println("Sum of a and b is: " + sum);

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int addition = num1 + num2;
        System.out.println("addition of num1 and num2 is: "+addition);
        sc.close();

    }
}
