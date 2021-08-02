public class Java_test_7 {
  public static void main(String[] args){

    int x = 3;
    int y = 7;

    int z = x; //一時変数zにxを代入
    x = y;
    y = z;

    System.out.println("x = " + x + ",y = " + y);
  }
}
