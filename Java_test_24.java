import java.io.*;

public class Java_test_24 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("aを入力して下さい");
    int a = Integer.parseInt(br.readLine());
    System.out.println("bを入力して下さい");
    int b = Integer.parseInt(br.readLine());

    if(a > b){
      System.out.println(a);
    }else{
      System.out.println(b);
    }
  }
}
