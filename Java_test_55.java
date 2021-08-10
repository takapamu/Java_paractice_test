import java.io.*;

public class Java_test_55{
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    System.out.println("数値を入力してください");
    int num = Integer.parseInt(br.readLine());

    for(int i = 0; i < num; i++){
      for(int j = 0; j < num; j++)
      if(i == j || (num - i -1) == j){
        System.out.print("X");
      }else{
        System.out.print(" ");
      }
      System.out.println();
    }
    }
  }