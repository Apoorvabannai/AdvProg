import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingString {
  public static void main(String[] args) {
    sortArray("abcUUm");
    sortedMultipleString();
  }

  public static void sortArray(String input) {
    char[] splittedString = input.toCharArray();
    for (int i = 0; i <  splittedString.length; i++) {
      for (int j = 0; j < splittedString.length; j++) {
        if (splittedString[i] > splittedString[j]) {
          char temp = splittedString[i];
          splittedString[i] = splittedString[j];
          splittedString[j] = temp;
        }
      }
    }
    System.out.println("sorted array is "+Arrays.toString( splittedString));
  }

  //reference

  public static void sortedMultipleString( ){
    System.out.println("Enter how many Strings you want to compare ");
    Scanner scanner =  new Scanner(System.in);
    int  num = scanner.nextInt();
    String[] inputs = new String[num];
    System.out.println("Enter the values of String ");
    for(int i = 0; i <= num; i++){
      inputs[i] = scanner.nextLine();
    }
   // scanner.nextLine();

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        if (inputs[i].compareTo(inputs[j])> 0){
          String temp = inputs[i];
          inputs[i] = inputs[j];
          inputs[j] = temp;
        }
      }
    }
    System.out.println("Sorted Strings are "+ Arrays.toString(inputs));

  }
}
