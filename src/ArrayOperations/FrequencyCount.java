package ArrayOperations;

import java.lang.reflect.Array;
import java.util.*;

public class FrequencyCount {
  public static void main(String[] args) {


    String str = "The adarsh is a very nice adarsh who always";
    String second = "The,a,is,who";

    String [] arrTwo = second.split(",");
    String[] arr1 = str.split(" ");
    List<String> list = new ArrayList (Arrays.asList(arr1));
    List<String> listTwo =new ArrayList(Arrays.asList(arrTwo));
    list.removeAll(listTwo);
    String[] arr = list.toArray(new String[0]);

//    String[] arr = str.split(" ");
    HashMap<String,Integer> hMap = new HashMap<>();
    for(int i= 0 ; i< arr.length ; i++) {
      if(hMap.containsKey(arr[i])) {
        int count = hMap.get(arr[i]);
        hMap.put(arr[i],count+1);
      } else {
        hMap.put(arr[i],1);
      }
    }
    System.out.println(hMap);
  }


}
