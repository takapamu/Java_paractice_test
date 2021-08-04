import java.io.*;


public class Java_test_22 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int year = Integer.parseInt(br.readLine());
    int day = year * 365;

    System.out.println("あなたの生まれてから現在の日数は、" + day);
  }
}
