import java.io.*;

public class Java_test_61 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int value = Integer.parseInt(br.readLine());

    int binary[] = new int[16];
    int n = 0;

    //配列に0か1を代入する
    while(value >= 2){
      binary[n] = value % 2;
      n++;
      value = value / 2;
    }

    binary[n] = value;
    n++;

    //逆に出力
    for(int i = n - 1; i >= 0; i--)
    System.out.print(binary[i]);
  }
}