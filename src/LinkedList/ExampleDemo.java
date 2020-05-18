package LinkedList;

import java.util.LinkedList;

public class ExampleDemo {
  public static void main(String [] args){
    LinkedList<String> students = new LinkedList<>();
    students.add("Rumani");
    students.add("Charlie");
    students.add("Chaya");
    students.addFirst("Apoorva");
    students.addFirst("Haley");
    students.add(4,"Mike");
    String first = students.getFirst();
    System.out.println("The First "+ first);
    String last = students.getLast();
    System.out.println("The last "+ last);
    int i = students.indexOf("Apoorva");
    System.out.println("The index of Apoorva is "+ i);
    System.out.println(students);
    System.out.print(students.get(3));
    System.out.print(students.size());
    students.removeFirst();
  }
}
