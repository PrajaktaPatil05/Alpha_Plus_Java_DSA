import java.util.*;

public class solution1{

    public static int avg_of_three_numbers(int x,int y,int z){
        return (x + y + z)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = avg_of_three_numbers(a,b,c);
        System.out.println("Average of three numbers is: "+average);

        sc.close();

    }
}