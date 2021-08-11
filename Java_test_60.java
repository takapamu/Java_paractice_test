
import java.io.*;

public class Java_test_60 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num[] = new int[10];
    int cnt, sum;

    for(cnt = 0, sum = 0; cnt < 10 && sum <= 100; cnt++ ){

      num[cnt] = Integer.parseInt(br.readLine());
      sum += num[cnt];
    }

    for(int i = 0; i < cnt; i++)
    System.out.print(" " + num[i]);

  }
}