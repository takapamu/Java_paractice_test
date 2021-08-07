import java.io.*;


public class Java_test_49 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("数を入力して下さい");
    int a = Integer.parseInt(br.readLine());

    while(a > 4){

      if(a % 2 == 0){
        System.out.println("素数です。");
        break;
      }else if(a % 3 == 0){
        System.out.println("素数です。");
        break;
      }else if(a % 4 == 0){
        System.out.println("素数です。");
        break;
      }else if(a % 5 == 0){
        System.out.println("素数です。");
        break;
      }else{
        System.out.println("素数では無い。");
        break;
      }
    }
  }
}
