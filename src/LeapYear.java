import java.util.Scanner;

public class LeapYear {

    public static void isLeapYear(int year){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  year you want to check");
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println("You have entered "+ year +" This is leap year");
        }
        else{
            System.out.println("You have entered "+ year +" This is not leap year");
        }
    }
    public static void main(String[]args){
        isLeapYear(2017);
    }
}
