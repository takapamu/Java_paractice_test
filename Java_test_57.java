import java.io.*;

public class Java_test_57{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num[] = new int[10];

    for(int i = 0; i < 10; i++){
      num[i] = Integer.parseInt(br.readLine());
    }

    for(int i = 0; i < 10; i++){
      System.out.println("二倍にした数は" + (2 * num[i]));
    }
  }

}