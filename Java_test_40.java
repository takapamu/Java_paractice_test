import java.io.*;

public class Java_test_40 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println(" 0 or 1を入力して下さい");

    int count_0 = 0; //負けカウント用
    int count_1 = 0; //勝ちカウント用

    for(int i = 0; i < 10; i++){
      int a = Integer.parseInt(br.readLine());

      if(a == 0){
        count_0++;
      }
      if(a == 1){
        count_1++;
      }
    }
    System.out.println("負け");
    System.out.println(count_0);
    System.out.println("勝ち");
    System.out.println(count_1);

  }
}
