import java.util.*;

public class Java_test_14 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("西暦年を入力して下さい: ");

    int year = sc.nextInt();

    if (year % 400 == 0){
      System.out.println("関年です");
    }else{
      System.out.println("関年ではありません");
    }
  }
}
