import java.util.Scanner;

public class DecimalOperator {

    public static double decimalComparrison(){
        double a;
        double b;

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of a with 3 decimal digits ");
         a = sc.nextDouble();
         System.out.println("enter value of b with 3 decimal digits");
         b = sc.nextDouble();
           a =  a *1000;
           System.out.println("the value of a is"+ a);
           b =  b* 1000;
          System.out.println("the value of b is"+ b);

        if(a==b){
               System.out.println("The values are same");
               return a;
           }
           else{
               System.out.println("They are not equal " + (a-b));
           }
         return (b-a);
    }
    public static void main(String[]args){
        decimalComparrison( );
    }
}
