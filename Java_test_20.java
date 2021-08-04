import java.io.*;


public class Java_test_20{
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());

    System.out.println("xとyの和は、" + (x + y));
    System.out.println("xとyの差は、" + (x - y));
    System.out.println("xとyの積は、" + (x * y));
    System.out.println("xとyの商は、" + (x / y));
    System.out.println("xとyの余りは、" + (x % y));
  }

}