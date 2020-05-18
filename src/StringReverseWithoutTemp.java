public class StringReverseWithoutTemp {
  public static void main(String[]args){
    stringReverse("i am super" );
  }
  public static  String stringReverse(String input){
    String output = "";
    for(int i = input.length()-1; i >= 0; i --){
      output = output + input.charAt(i);
    }
    System.out.println(output);
   return output;
  }
}
