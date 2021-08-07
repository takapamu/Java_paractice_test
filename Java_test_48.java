import java.io.*;

public class Java_test_48 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int s = 0; //ストライクカウント用
    int b = 0; //ボールカウント用
    int f = 0; //ファールカウント用

    while(s < 3 && b < 4){

      System.out.println("ストライクなら１、ボールなら２、ファールなら３を入力して下さい");
      int a = Integer.parseInt(br.readLine());

      if(a == 1){
        s++;
      }

      if(a == 2){
        b++;
      }

      if(a == 3){
        f++;
      }
    }
    System.out.println(b + "ボール" + s + "ストライク");
  }
}