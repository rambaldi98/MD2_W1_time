import java.sql.SQLOutput;
import java.util.Scanner;

public class DayWithMonth {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int month = s.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + " co 31 ngay " );
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + " co 30 ngay " );
                break;
            case 2:
                System.out.println(month + " co 28 hoac 29 ngay " );
                break;
            default:
                System.out.println("nhap sai ngay thang");
                break;
        }
    }
}
