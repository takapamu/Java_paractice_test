import java.io.*;

public class Java_test_41 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int sum_1 = 0; //巨人点数カウント用
    int sum_2 = 0; //阪神点数カウント用

    for(int i = 1; i < 10; i++ ){

      System.out.println(i + "回表、巨人の得点は");
      int a = Integer.parseInt(br.readLine());
      System.out.println(i + "回裏、阪神の得点は");
      int b = Integer.parseInt(br.readLine());
      sum_1 += a;
      sum_2 += b;

    }

    if (sum_1 > sum_2){
      System.out.println("巨人の勝ち");
    }else if(sum_1 < sum_2){
      System.out.println("阪神の勝ち");
    }else{
      System.out.println("引き分け");
    }
  }
}
