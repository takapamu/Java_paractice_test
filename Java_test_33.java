import java.io.*;

public class Java_test_33{
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("好きなお寿司を選んでね");
    System.out.println("1:まぐろ 2:えび 3:こはだ 4:サーモン 5:あなご");

    int sushi = Integer.parseInt(br.readLine());

    switch(sushi){

      case 1:
      System.out.println("スーパーラッキー");
      break;

      case 2:
      System.out.println("ラッキー");
      break;

      case 3:
      System.out.println("アンラッキー");
      break;

      case 4:
      System.out.println("スーパーアンラッキー");
      break;

      case 5:
      System.out.println("超スーパーラッキー");
      break;
    }
  }
}