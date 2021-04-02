import java.util.Scanner;

public class KiemTraNamNhuan {
    public static boolean check(int n){
        if(n % 100 == 0 && n % 400 != 0){
            return false;
        } else {
            if(n % 4 == 0 || n % 400 == 0)
                return true;
        }
            return false;
    }
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        if(check(year)) {
            System.out.println( year +" la nam nhuan");
        }
        else {
            System.out.println(year + "khong phai la nam nhuan");
        }
    }
}
