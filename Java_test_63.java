import java.io.*;

public class Java_test_63 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int kuku[][] = new int[9][9];

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++)
        kuku[i][j] = (i + 1) * (j + 1);
    }

    int p = Integer.parseInt(br.readLine());
    int q = Integer.parseInt(br.readLine());

    System.out.println(kuku[p - 1][q - 1]);

  }
}
