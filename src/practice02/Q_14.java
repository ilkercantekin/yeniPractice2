package practice02;


import java.util.Scanner;

public class Q_14 {
    /* Kullaniciya gunde kac saat uyudugunu sorun,
     * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen günde kaç saat uyuduğunuzu giriniz : ");
        float uyku = scanner.nextFloat(); // uyku saat cinsinden

        float ay = (uyku*30)/24f;// bir ayda kaç gün uyuduğunu bulmamız için
        //bir günde 24 saat olduğu için uyku*30 / 24 bize 30 günde kaç gün uyuduğunun formülünü veririr.

        float yil = (uyku*365)/24f; // bir yılda kaç gün uyuduğunun gün sayısı
        // float yil = ay*12;

        float kirkyil = yil* 40f; // 40 yılda kaç gün uyuduğunun gün sayısı

        System.out.println("bir ayda uykuda geçen gün sayısı :  " + ay );
        System.out.println("bir yılda uykuda geçen gün sayısı :"  + yil);
        System.out.println(" kırk yılda uykuda geçen gün sayısı : " + kirkyil);
        scanner.close();


    }

}
