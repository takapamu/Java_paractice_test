import java.io.*;

public class Java_test_34 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("月を入力して下さい");
    int month = Integer.parseInt(br.readLine());

    switch(month){

      case 1:
      System.out.println("31日です。");
      break;

      case 2:
      System.out.println("28日です。");
      break;

      case 3:
      System.out.println("31日です。");
      break;

      case 4:
      System.out.println("30日です。");
      break;

      case 5:
      System.out.println("31日です。");
      break;

      case 6:
      System.out.println("30日です。");
      break;

      case 7:
      System.out.println("31日です。");
      break;

      case 8:
      System.out.println("31日です。");
      break;

      case 9:
      System.out.println("30日です。");
      break;

      case 10:
      System.out.println("31日です。");
      break;

      case 11:
      System.out.println("30日です。");
      break;

      case 12:
      System.out.println("31日です。");
      break;

      default:  //例外処理
      System.out.println("入力が間違っています");
      break;
    }
  }
}
