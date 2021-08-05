import java.io.*;

public class Java_test_39 {
 public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;
    for(int i = 0; i < 10; i++){

      int n = Integer.parseInt(br.readLine());
      sum += n;
    }

    System.out.println("平均値は" + (sum / 10) + "です。");
  }
}
