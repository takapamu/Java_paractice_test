import java.io.*;

public class Java_test_52{
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    int sum = 0;

    while(true){
      System.out.println("数値を入力してください");
      int num = Integer.parseInt(br.readLine());
        if(num == 0){
          break;
        }
      sum += num;
    }
      System.out.println("合計は" + sum);
    }
  }
