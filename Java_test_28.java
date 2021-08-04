import java.io.*;

public class Java_test_28{
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("テストの点を入力して下さい");
    int a = Integer.parseInt(br.readLine());

    if (a >= 60 ){
      System.out.println("合格");
    }else{
      System.out.println("不合格");
    }

    if(a >= 80){
      System.out.println("たいへんよくできました.");
    }else if(a >= 60){
      System.out.println("よくできました。");
    }else{
      System.out.println("ざんねんでした。");
    }

    if(a >= 80){
      System.out.println("優");
    }else if(a >= 70){
      System.out.println("良");
    }else if(a >= 60){
      System.out.println("可");
    }else{
      System.out.println("不可");
    }
  }
}