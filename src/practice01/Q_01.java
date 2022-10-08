package practice01;

import java.util.Scanner;

public class Q_01 {



//Question: Print an integer getting input from user


    /*
  println() ve print() arasinda tek fark var;
  println satir atliyor,
  print ise imlecin ayni satirda kalmasini sagliyor.
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print
                ("bir tam sayı giriniz : ");
        int num = scan.nextInt();
        System.out.println("girdiğiniz sayı " + num);
    }





}
