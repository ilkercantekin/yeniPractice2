package practice01;

public class Q_08 {
    /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;
        bu double sayilarin ortalamasini bulunuz
     */

    public static void main(String[] args) {
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

        double sum = num1+num2+num3+num4+num5;

        double avarage = sum / 5 ;

        System.out.println("avarage = " + avarage );
    }
}
