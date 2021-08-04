import java.io.*;

public class Java_test_23 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("xを入力して下さい");
    int x = Integer.parseInt(br.readLine());
    System.out.println("yを入力して下さい");
    int y = Integer.parseInt(br.readLine());

    if (x > y){
      System.out.println("xはyより大きい");
    }else{
      System.out.println("xはyより小さい");
    }
  }
}
