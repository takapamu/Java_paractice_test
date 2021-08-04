import java.io.*;


public class Java_test_29 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("中間試験の点数を入力して下さい");
    int x = Integer.parseInt(br.readLine());
    System.out.println("期末試験の点数を入力して下さい");
    int y = Integer.parseInt(br.readLine());

    int z;
    z = x + y;

    if(x >= 60 && y >= 60){
      System.out.println("合格");
    }else if(z >= 130){
      System.out.println("合格");
    }else if(z >= 100 && x >= 90){
      System.out.println("合格");
    }else if(z >= 100 && y >= 90){
      System.out.println("合格");
    }else{
      System.out.println("不合格");
    }
  }
}
