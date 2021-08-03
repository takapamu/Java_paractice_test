import java.util.*;

public class Java_test_16 {
  public static void main(String[] args){

    //入力準備
    Scanner sc = new Scanner(System.in);

    //身長の入力
    System.out.println("身長(cm)を入力して下さい");
    double height = sc.nextDouble();

    //体重の入力
    System.out.println("体重(kg)を入力して下さい");
    double weight = sc.nextDouble();

    //BMIの計算
    height = height / 100;
    double bmi = weight / (height * height);

    //結果の出力
    System.out.println("BMI = " + bmi);

    //判定
    if(bmi > 25){
      System.out.println("肥満");
    }else if (bmi > 18){
      System.out.println("標準");
    }else{
      System.out.println("低体重");
    }
  }
}
