public class pattern4 {
    public static void floyds_triangle(int n){
        int x = 1;
        //outer loop - for lines
        for(int i = 1; i <= n; i++){
            
            //inner loop - how many times will counter be printed
            for(int j=1; j<=i;j++){
                System.out.print(x+" ");
                x++;
            }
            
            System.out.println();
        }
    }
    public static void main(String args[]){
        floyds_triangle(5);
    }
}
