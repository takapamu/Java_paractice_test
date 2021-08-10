public class Java_test_56 {
  public static void main(String[] args){

    int f0,f1,f2;

    f0 = 0;
    f1 = 1;

    System.out.println(f0);

    while(f1 < 1000){ //1000まで繰り返し
      System.out.println(f1);

      f2 = f0 + f1;

      f0 = f1;

      f1 = f2;
    }
  }
}
