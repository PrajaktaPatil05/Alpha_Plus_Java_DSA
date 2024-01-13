public class ternaryOperator {
    public static void main(String args[]){
        //variable = condition?statement1:statement2;

        int num = 9;

        //ternary operator

       String type = ( (num%2) == 0 ) ? "even" : "odd";
       System.out.println(type);

       int a = 25;
       int b = 9;

       int check = (a > b) ? a : b;
       System.out.println(check);
    }
}
