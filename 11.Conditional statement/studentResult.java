import java.util.*;
public class studentResult {
    public static void main(String arge[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        float marks = sc.nextFloat();
        
        //ternary operator
        String result = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(result);
        sc.close();
    }
}
