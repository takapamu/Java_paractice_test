import java.io.*;

public class Java_test_54{
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    System.out.println("数値を入力してください");
    int num = Integer.parseInt(br.readLine());

    for(int i = 0; i < num; i++){
      for(int j = 0; j <= i; j++)
        System.out.print("＄");
      System.out.println();
    }
    }
  }

