import java.lang.reflect.Array;
import java.util.Arrays;

class ArraySorting{
        //array = [1,9,5,2]
  public static void main(String[]args){
    int [] a = {2,0,109,6,88,4};
    ArraySort(a);
  }
  public static void ArraySort(int[] givenArray){
    System.out.println("The given Array is "+ (Arrays.toString(givenArray)));
    int temp;
    int swap = 0;
    for( int i = 0; i < givenArray.length; i++) {
      for (int j = 0; j < givenArray.length ; j++) {
        if (givenArray[i] < givenArray[j]) {
          temp = givenArray[i];
          givenArray[i] = givenArray[j];
          givenArray[j] = temp;
        }
      }
    }
    System.out.println(" The sorted Array in ascending order is "+ Arrays.toString(givenArray));

  }
}

