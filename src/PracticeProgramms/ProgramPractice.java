package PracticeProgramms;

import javax.sound.midi.SysexMessage;

public class ProgramPractice {
  public static void main(String[] args) {
//    factorialOfNumber(6);
//    System.out.println(factorialRecursion(6));
//    System.out.println(factTerenary(6));
//    System.out.println(factTerenary(6));
//    primeNUmber(19);
    printPrime(30);
    stringPalindrome("Apoorva");
  }

  //Fibonacci series 3! = 3*2*1
  // factorial using iteration
  public static int factorialOfNumber(int n) {
    int product = 1;
    for (int i = 1; i <= n; i++) {
      product *= i;
    }
    System.out.println(product);
    return product;
  }

  public static int factorialRecursion(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factorialRecursion(n - 1);
  }

  // using terenary

  static int factTerenary(int n) {
    return ((n == 0) || (n == 1)) ? 1 : n * factTerenary(n - 1);
  }

  // prime number
  // prime number is number which is divisible by one and itself, which can
  // be calculated to check if given number or print.
  static void primeNUmber(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
      double factor = n / i;
      double round = Math.ceil(factor);
      if (factor == round) {
        count++;
      }
    }
    if (count == 2) {
      System.out.println("The " + n + " is   Prime");
    } else {
      System.out.println("The " + n + " is not  Prime");
    }
  }

  // to print number of prime numbers  from 1 to n
  // Write two for loops outer one checks 1 to number and inner cheks 1 - first loop
  // first loop i = 1 inner loop j = 1,
  // first loop i = 2 inner loop j = 1 and 2 and reset count to 0 at end or else count wont reset
  static void printPrime(int n) {
    int count = 0;
    int i = 1;
    double factor;
    double round;
    System.out.println("Prime numbers are:");
    for (i = 2; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        factor = (double) i / j;
        round = Math.ceil(factor);
        if (round == factor) {
          count++;
        }
      }
      if (count == 2) {
        System.out.println(i + " number is prime ");
      }
      count = 0;
    }

  }
  //String Palindrom
  // String palindrome is bob means bob mom and others if we reverse the string must be same

  public static void stringPalindrome(String toCheck ){
    String reverse = "";
    for( int i = toCheck.length()-1; i>=0; i--){
      reverse = reverse+ toCheck.charAt(i);
    }
    System.out.println("Reverse String is "+ reverse);
  }
  //Integer Palindrome
  // 12345 -54321
  public static int integerPalindrome(int numbers){
    int number;

  }

}
