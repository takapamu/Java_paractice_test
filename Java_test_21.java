import java.io.*;


public class Java_test_21 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c;
    c = (a + b) / 2;

    System.out.println("a と b の平均値は、" + c);
  }
}
