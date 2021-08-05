public class Java_test_37 {
  public static void main(String[] args){

    //底
    int a = 2;

    //指数
    int n = 8;

    //累乗計算の解
    int result = 1;

    for(int i = 1; i <= n; i++){
      result = result * a;
      System.out.println(result);
    }
  }
}
