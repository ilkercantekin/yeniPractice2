package practice01;

import java.util.Scanner;

public class Q_01 {

    public static void main(String[] args) {
//Question: Print an integer getting input from user
        Scanner reader = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");

        int num = reader.nextInt();

        System.out.println("Girmiş olduğunuz sayı " + num );


    }



    /*
  println() ve print() arasinda tek fark var;
  println satir atliyor,
  print ise imlecin ayni satirda kalmasini sagliyor.
   */




}
