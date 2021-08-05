import java.io.*;

public class Java_test_32 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("月を入力して下さい");
    int m = Integer.parseInt(br.readLine());

    switch(m){
      case 1:
      System.out.println("元日、成人の日");
      break;

      case 2:
      System.out.println("建国記念日");
      break;

      case 3:
      System.out.println("春分の日");
      break;

      case 4:
      System.out.println("昭和の日");
      break;

      case 5:
      System.out.println("憲法記念日、みどりの日、こどもの日");
      break;

      case 6:
      System.out.println("祝日はありません");
      break;

      case 7:
      System.out.println("海の日");
      break;

      case 8:
      System.out.println("祝日はありません");
      break;

      case 9:
      System.out.println("敬老の日、春分の日");
      break;

      case 10:
      System.out.println("体育の日");
      break;

      case 11:
      System.out.println("文化の日、勤労感謝の日");
      break;

      case 12:
      System.out.println("天皇誕生日");
      break;
    }
  }
}
