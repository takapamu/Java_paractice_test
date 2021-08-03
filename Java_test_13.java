import java.util.*;

public class Java_test_13 {
  public static void main(String[] args){

    //入力準備
    Scanner sc = new Scanner(System.in);

    //使用量の入力
    System.out.println("使用量(m^3)を入力して下さい: ");
    int amount = sc.nextInt();

    //料金の計算
    int price;
    if( amount <= 20){
      price = 745 + 172 * amount;
    }else{
      price = 745 + 172 * 20 + 157 * (amount - 20);
    }

    System.out.println(price + "円");
  }

}
