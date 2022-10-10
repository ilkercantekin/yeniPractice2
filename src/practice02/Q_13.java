package practice02;

import java.util.Scanner;

public class Q_13 {
    /*
     *
     *
     * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
     * ve vucut kutle endeksini bulun.
     * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
     *
     * VKE= kilo/(boy*boy) .. Kilo : kilogram , Boy : metre olmalidir
     *
     * Ornek : Input : boy :180 kilo : 80
     *         Output : Vucut kutle endeksiniz : 24
     *                  Vucut kutle endeksiniz : 24.691
     *
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen boyunuzu cm cinsinden giriniz : ");
        double boy = scan.nextDouble();
        double boyCm = boy / 100 ;

        System.out.println("lütfen kilonuzu kg cinsinden giriniz : ");
        double kilo = scan.nextDouble();

        double vke = kilo/(boyCm*boyCm) ;
        System.out.println(vke);

        scan.close();


    }
}
