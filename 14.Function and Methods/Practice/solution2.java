import java.util.*;
public class solution2 {

    public static boolean isEven(int x){

        if(x % 2 == 0){
            return true;
        }

        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(isEven(a));
        sc.close();
    }
}
