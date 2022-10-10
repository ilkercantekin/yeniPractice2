package practice02;

import java.util.Locale;
import java.util.Scanner;

public class Q_11 {
    /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */
    public static void main(String[] args) {
        System.out.print("Lütfen iş ünvanınızı giriniz : ");
        Scanner scan = new Scanner(System.in);

        String jobTitle = scan.nextLine().toLowerCase();

       /* if (jobTitle.equals("qa")){
            System.out.println("iş unvanınız :Quality Analyst " );
        }else if (jobTitle.equals("dev")){
            System.out.println("iş unvanınız : Developer");
        }else if ( jobTitle.equals("ba")){
            System.out.println("iş unvanınız : Business Analyst");
        }else if (jobTitle.equals("pm")){
            System.out.println("iş unvanınız : Project Manager");
        }else {
            System.out.println("yanlış veri girdiniz lütfen daha sonra tekrar deneyizniz");
        }
*/

        //2. YOL

        switch (jobTitle){
            case "qa":
                System.out.println("iş unvanınız :Quality Analyst");
                break;
            case "dev":
                System.out.println("iş unvanınız : Developer");
                break;
            case "ba" :
                System.out.println("iş unvanınız : Business Analyst");
                break;
            case "pm":
                System.out.println("iş unvanınız : Project Manager");
                break;
            default:
                System.out.println("yanlış veri girdiniz lütfen daha sonra tekrar deneyizniz");
        }



    }


}
