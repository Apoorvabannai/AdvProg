import java.util.logging.Logger;

public class IsEqualSum {

  Logger LOGGER = Logger.getLogger(IsEqualSum.class.getName());

  public boolean isCheckerEqual(int a, int b, int c) {
    if ((a + b) == c) {
      System.out.println("The sum of first two digits is equal to third");
      return true;
    } else {
      LOGGER.info("Not equal");
      return false;
    }
  }

  public static void main(String[] args) {
    IsEqualSum ism = new IsEqualSum();
    ism.isCheckerEqual(4, 9, 10);
  }
}
