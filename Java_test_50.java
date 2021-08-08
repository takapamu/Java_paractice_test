import java.io.*;

public class Java_test_50{
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("数値を入力してください");
    int num = Integer.parseInt(br.readLine());

    for(int i = 2; num > 1; i++){
      while((num % i) == 0){  //最小の因数を求める
        System.out.println(i + " " );
        num /= i; //最小の因数で割った数を代入する
      }
    }
  }
}