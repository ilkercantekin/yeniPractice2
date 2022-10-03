package practice01;

public class Q_06 {
    //Question largest and smallest numbers finding

    public static void main(String[] args) {
        int x = 600;
        int y = 200;
        int z = 500;
// 1. YOL
        if (x > y && x > z) {
            System.out.println("x en büyüktür");
        } else if (y > z) {
            System.out.println("y en büyük sayıdır");
        } else {
            System.out.println("z en büyük sayıdır");
        }
        //2. YOL

        if (x >= y) {
            if (x >= z) {
                System.out.println("x en büyük sayıdır");
            } else {
                System.out.println("z büyük sayıdır");
            }

        } else {
            if (y >= z) {
                System.out.println("y en büyük sayıdır");

            } else {
                System.out.println("z en büyük sayıdır ");
            }

        }
    }
}
