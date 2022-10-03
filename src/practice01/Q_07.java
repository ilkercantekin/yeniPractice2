package practice01;

import java.util.Scanner;

public class Q_07 {
    // Question using Scanner, could you find a double number positive or negative ?
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("double türünde sayı girizniz : ");

        double number = scan.nextDouble();

        if ( number<0.0){
            System.out.println(number + " negatif sayıdır");

    }else if (number>0.0){
            System.out.println( number + " pozitif sayıdır");

} else {
            System.out.println(number + "sıfırıdr");

        }}}
