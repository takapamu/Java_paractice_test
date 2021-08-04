import java.io.*;

public class Java_test_30 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("診療日を入力して下さい");
    int a = Integer.parseInt(br.readLine()); //0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜とする

    System.out.println("診療時間を入力して下さい");
    int b = Integer.parseInt(br.readLine()); //0=午前、1=午後、2=夜間

    //日曜日
    if(a == 0){
      if(b == 0){
        System.out.println("休診");
      }else if(b == 1){
        System.out.println("休診");
      }else{
        System.out.println("休診");
      }
    }

    //月曜日
    if(a == 1){
      if(b == 0){
        System.out.println("受信可能");
      }else if(b == 1){
        System.out.println("受信可能");
      }else{
        System.out.println("受信可能");
      }
    }

    //火曜日
    if(a == 2){
      if(b == 0){
        System.out.println("休診");
      }else if(b == 1){
        System.out.println("受信可能");
      }else{
        System.out.println("受信可能");
      }
    }
    //水曜日
    if(a == 3){
      if(b == 0){
        System.out.println("受信可能");
      }else if(b == 1){
        System.out.println("受信可能");
      }else{
        System.out.println("休診");
      }
    }

    //木曜日
    if(a == 4){
      if(b == 0){
        System.out.println("受信可能");
      }else if(b == 1){
        System.out.println("受信可能");
      }else{
        System.out.println("受信可能");
      }
    }

    //金曜日
    if(a == 5){
      if(b == 0){
        System.out.println("休診");
      }else if(b == 1){
        System.out.println("受信可能");
      }else{
        System.out.println("受信可能");
      }
    }

    //土曜日
    if(a == 6){
      if(b == 0){
        System.out.println("受信可能");
      }else if(b == 1){
        System.out.println("休診");
      }else{
        System.out.println("休診");
      }
    }
  }
}
