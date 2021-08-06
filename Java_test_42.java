import java.io.*;

public class Java_test_42 {
  public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("整数を10個入力して下さい");
    int max = 0;

    for(int i = 0; i < 10; i++){
      int a = Integer.parseInt(br.readLine());

      if (a >= max){
        max = a;
      }
    }

    System.out.println("最大値は、" + max);
  }
}
