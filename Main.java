import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner stdIn = new Scanner(System.in);
   
      System.out.println("BMIを計算して肥満度を表示します。");
   
      System.out.println("身長(cm)を入力してください:");
      double height = stdIn.nextDouble();
      System.out.println("体重(kg)を入力してください:");
      double weight = stdIn.nextDouble(); 
   
      double bmi = weight / Math.pow(height, 2);
      bmi = bmi * 10000;
      
      System.out.print("BMI値は");
      System.out.printf("%.2f",bmi);
      System.out.println("です。");
  }
}
