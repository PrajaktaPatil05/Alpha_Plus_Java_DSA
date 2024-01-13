import java.util.*;
public class doWhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int counter = 1;
        do{
            System.out.println("Hiiiii Praju...");
            counter++;
        }while(counter <= n);

        sc.close();
    }
}
