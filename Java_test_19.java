import java.io.*;


public class Java_test_19 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int x = Integer.parseInt(br.readLine());

    System.out.println(x);
    System.out.println(x * x);
    System.out.println(x * x * x);
  }
}
