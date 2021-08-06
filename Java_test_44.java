import java.io.*;

public class Java_test_44 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("数値を入力して下さい");
    int a = Integer.parseInt(br.readLine());
    
    for(int i = 0; i <= a; i++){
      System.out.println("*");
    }
  }
}
