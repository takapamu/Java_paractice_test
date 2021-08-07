import java.io.*;

public class Java_test_47 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int s = 0;
    int b = 0;

    while(s < 3 && b < 4){

      System.out.println("ストライクなら１、ボールなら２を入力して下さい");
      int a = Integer.parseInt(br.readLine());

      if(a == 1){
        s++;
      }

      if(a == 2){
        b++;
      }
    }
    System.out.println(b + "ボール" + s + "ストライク");
  }
}
