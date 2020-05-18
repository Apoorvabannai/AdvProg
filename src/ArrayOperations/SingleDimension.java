package ArrayOperations;

public class SingleDimension {
 int[] arr = null;

 // constructor for taking input size of array
  public SingleDimension( int sizeOfArray) {
    arr = new int[sizeOfArray];
    for(int i = 0; i <arr.length;i++){
      arr[i]= Integer.MIN_VALUE;
    }
  }
  // traversing through the elements and printing
   public void traversingArray(){
    try{
      for(int i = 0; i< arr.length; i++){
        System.out.println(arr[i]);
      }
    }
    catch(Exception e ){
       System.out.println("The array no longer exists");
     }
   }

   public void insertingArrayElement( int location, int value){
     try{
       if(arr[location] == Integer.MIN_VALUE) {
         arr[location] = value;
         System.out.println("Changed the value of " + value + "in" + location);
       } else {
           System.out.println("Array is already occupied ");
         }
     }
     catch( Exception e){
       System.out.println("Enter valid details ");
     }
   }
   // accessing perticular element in the array
    public void accessingElement( int indexOfElement){
      System.out.println("The element is "+ arr[indexOfElement]);
    }
    // Search  for an element in the array
    public void searchInArray(int value){
      for(int i = 0; i <arr.length; i++){
        if(arr[i] == value){
        System.out.println("Value found, the index of "+ value +" is "+ i);
        return;
        }
      }
      System.out.println(" The value is not in array");
    }
    //detelting element and assigning min value to it
   public void deletingElementFromArray(int element){
    try{
        arr[element ] = Integer.MIN_VALUE;
      }
    catch(Exception e){
      System.out.println("Array limit is not listed");
    }
   }
}
