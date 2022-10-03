package practice01;

import java.util.Scanner;

public class Q_05 {
    //Question even or odd number ( tek mi çift mi ? )

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");

        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + "çift sayıdır");
        } else {
            System.out.println(num + " tek sayıdır.");
        }
    }
}

    //  can you check any given char Alphabet or not ?

