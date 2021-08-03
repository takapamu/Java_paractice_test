import java.util.*;

public class Java_test_15 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //サイコロの目をランダムに設定
    int dice1 = (int)(Math.random() * 6) + 1;
    int dice2 = (int)(Math.random() * 6) + 1;
    int result = (dice1 + dice2) % 2;

    //人間の選択
    System.out.println("丁か半か？(丁なら０ 半なら１を入力して下さい");

    int x = sc.nextInt();

    //結果の出力
    System.out.println(dice1 + "" + dice2 + "の");
    if (result == 0){
      System.out.println("丁です");
    }else{
      System.out.println("半です");
    }

    //勝ち負け判定
    if (x == result){
      System.out.println("あなたの勝ちです");
    }else{
      System.out.println("あなたの負けです");
    }
  }
}
