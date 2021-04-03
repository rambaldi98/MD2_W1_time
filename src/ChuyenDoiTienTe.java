import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();
        System.out.println(chuyenDoi(num));

    }

    public static double chuyenDoi(double n) {
        return n * 23000;
    }
}

