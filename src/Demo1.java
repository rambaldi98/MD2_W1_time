import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
            float height ;
            float width;
        Scanner s = new Scanner(System.in);
        height = s.nextFloat();
        width = s.nextFloat();
        float area = height * width;
        System.out.print("area = "+area );
    }
}
