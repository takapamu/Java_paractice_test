import java.io.*;

public class Java_test_69{
  public static void main(String[] args){
    DrawTriangle2(3,'%'); //charは''で囲む
    System.out.println();
    DrawTriangle2(5,'#');
    System.out.println();
    DrawTriangle2(7,'@');
    System.out.println();
  }

  static void DrawTriangle2(int size,char ch){
    for(int i = 0; i < size; i++){
      for(int j = 0; j <= i; j++)
        System.out.print(ch);
      System.out.println();
    }
    }
  }