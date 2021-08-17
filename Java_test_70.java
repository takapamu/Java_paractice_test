
public class Java_test_70 {
  public static void main(String[] args) {

    for(int i = 1; i <= 9; i++)
    Kuku(i);
  }

  static void Kuku(int num){
    for(int i = 1; i <= 9; i++){
      System.out.printf("%2d",num * i);
    }
    System.out.println();
  }
}
