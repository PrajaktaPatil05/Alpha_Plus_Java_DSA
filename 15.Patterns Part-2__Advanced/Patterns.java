import java.util.*;

public class Patterns{

    public static void hollowRectangle(int totRows,int totCols){
        //outer loop
        for(int i = 1; i <=totRows; i++){
            //inner loop
            for(int j = 1; j<=totCols; j++){
                //cell (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int x){
        //outer loop lines or rows
        for(int i = 1; i <= x; i++){
            //spaces
            for(int j = 1; j<= x - i; j++){
                System.out.print("  ");

            }
            //stars 
            for(int j = 1 ; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        hollowRectangle(a,b);
        System.out.println();
        sc.close();
        
        inverted_rotated_half_pyramid(8);
    }
}