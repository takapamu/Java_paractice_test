import java.io.*;

public class Java_test_59 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num[] = new int[10];

    for (int i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(br.readLine());
    }

    System.out.printf("偶数：");
    for (int i = 0; i < 10; i++) {
      if (num[i] % 2 == 0) {
        System.out.print(" " + num[i]);
      }
    }

    System.out.println();
    System.out.printf("奇数：");
    for (int i = 0; i < 10; i++) {
      if (num[i] % 2 == 1) {
        System.out.print(" " + num[i]);
      }
    }
  }

}