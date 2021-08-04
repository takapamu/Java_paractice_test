import java.io.*;

public class Java_test_27 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("整数aを入力して下さい");
    int a = Integer.parseInt(br.readLine());

    if(a >= 0 && a % 2 == 0){
      System.out.println("正の偶数");
    }else if(a < 0 && a % 2 == 0){
      System.out.println("負の偶数");
    }else if(a > 0 && a % 2 != 0){
      System.out.println("正の奇数");
    }else{
      System.out.println("負の奇数");
    }
  }
}
