import java.util.*;
public class conditional {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Adult : vote,Drive");
        }

        if(age >= 13 && age < 18){
            System.out.println("Teenagers");
        }

        if(age > 6 && age <= 12){
            System.out.println("Children");
        }

        if(age > 0 && age <= 6){
            System.out.println("Baby");
        }

        sc.close();
    }
}