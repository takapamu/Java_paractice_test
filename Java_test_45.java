import java.io.*;


public class Java_test_45 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("数値を入力して下さい");
    int count = Integer.parseInt(br.readLine());

    for(int i = 0; i < count; i++){
      System.out.print(i % 10);
    }
    System.out.println();

    String pattern = "0123456789";
  }
}
