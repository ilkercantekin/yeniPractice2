package practice01;

import java.util.Scanner;

public class Q_05 {
    //Question even or odd number ( tek mi çift mi ? )

    //  can you check any given char Alphabet or not ?

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");

        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " bir çift sayıdır");

        } else {
            System.out.println(num + " bir tek sayıdır");

        }
    }
}



