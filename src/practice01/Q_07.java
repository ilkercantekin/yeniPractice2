package practice01;

import java.util.Scanner;

public class Q_07 {
    // Question using Scanner, could you find a double number positive or negative ?
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("bir double türünden sayı giriniz :");

       double sayi = scan.nextDouble();

       if (sayi<0.0){
          System.out.println(sayi + " negatif sayıdır.");
       }else if (sayi>0.0){
          System.out.println(sayi + " pozitif sayidir");
       }else {
          System.out.println(sayi + " sıfırdır / nötr sayıdır.");
       }
    }
   }
