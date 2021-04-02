import java.util.Scanner;

public class Ptbn {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b =s.nextFloat();
        if(a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh co vo so nghiem");
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        } else {
            System.out.println("phuong trinh co nghiem x = " + -b/a);
        }
    }
}
