import java.io.*;

public class Java_test_53{
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int sum = 0;
    int count = 0;

    while(true){
      System.out.println("数値を入力してください");
      int num = Integer.parseInt(br.readLine());
        if(num == 0){
          break;
        }
      sum += num;
      count++;
    }
      System.out.println("平均は" + sum / count);
    }
  }
