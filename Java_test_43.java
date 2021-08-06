import java.io.*;

public class Java_test_43 {
  public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("整数を10個入力して下さい");
    int max = 0;
    int min = 0;

    for(int i = 0; i < 10; i++){
      int a = Integer.parseInt(br.readLine());

      if (a >= max){
        max = a;
      }else if(a <= min){
        min = a;
      }
    }

    System.out.println("最大値は、" + max);
    System.out.println("最小値は、" + min);
  }
}