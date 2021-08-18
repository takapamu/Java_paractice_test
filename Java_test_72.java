import javax.lang.model.util.ElementScanner6;

public class Java_test_72 {
  public static void main(String[] args){
    for(int n = 11; n <= 20; n++)
    System.out.print(getFibonacciNumber(n) + " ");
  }

  public static int getFibonacciNumber(int n) {
    if (n == 0)
      return 0;
    else if (n == 1)
      return 1;
    else
      return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
  }
}
