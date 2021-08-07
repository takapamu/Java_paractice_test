import java.io.*;

public class Java_test_46 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int sum = 0;

    do{
      System.out.println("正の整数を入力して下さい → ");
      int a = Integer.parseInt(br.readLine());

      sum += a;

    }while(sum <= 100);
    
    System.out.println(sum);
  }
}
