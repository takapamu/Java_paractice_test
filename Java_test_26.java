import java.io.*;


public class Java_test_26 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("整数aを入力して下さい");
    int a = Integer.parseInt(br.readLine());

    if (a % 2 == 0){
      System.out.println("偶数です");
    }else{
      System.out.println("奇数です");
    }
  }
}
