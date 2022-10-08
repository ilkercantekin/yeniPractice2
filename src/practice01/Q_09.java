package practice01;

import java.util.Scanner;

public class Q_09 {
    /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon




        Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
         formül
        c = (f-32)*5/9
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("galonu litreye çevirmek için galon cinsinden birim giriniz : ");

        double gallon = scan.nextDouble();

        double litre = gallon * 3.785;

        System.out.println(gallon + " gallon degeri " + litre + " litredir" );

    }

}
