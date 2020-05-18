package ArrayOperations;

public class SingleDimensionMain {
  public static void main(String[]args){
     SingleDimension sD = new SingleDimension(6);
     System.out.println("Printing array ");
     sD.traversingArray();
     sD.insertingArrayElement(0,8);
     sD.insertingArrayElement(1,34);
     sD.insertingArrayElement(2,80);
     sD.insertingArrayElement(3,34);
     sD.insertingArrayElement(4, 90);
     sD.insertingArrayElement(5,11);
     sD.insertingArrayElement(6,120);
     sD.traversingArray();
     sD.accessingElement(3);
    sD.searchInArray(90);
    sD.searchInArray(78);
    sD.traversingArray();
    sD.deletingElementFromArray(2);
    sD.traversingArray();
  }
}
