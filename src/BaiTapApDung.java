import java.util.Scanner;

public class BaiTapApDung {
    // bai1 kiem tra neu so nguyen n neu n >= 0 thi la so nguyen duong
     public static void bai1(int n){
        if(n >= 0)
            System.out.println("day la so nguyen duong");
        else
            System.out.println("day la so nguyen âm");
    }

    // kiem tra a,b,c co la tam giac vuong khong?
     public static void bai2(int a,int b,int c) {
         if(a + b > c && a + c > b && b + c >a){
             if((a*a + b *b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a) ){
                 System.out.println("day la 3 canh tam giac vuong");
             }
             else
                 System.out.println("day la 3 canh tam giac thuong");
         }
         else
             System.out.println("day khong phai la tam giac");
    }

    // bai 3 kiem tra chia het 3 va 5
    public static void bai3(int n) {
         if(n % 15 == 0)
             System.out.println("FIZZBUZZ");
         else if(n % 3 == 0)
             System.out.println("FIZZ");
         else if(n % 5 == 0)
             System.out.println("BUZZ");
    }
    // bai 4 kiem tra so nguyen to
    public static boolean checkSNT(int n) {
         if(n <= 1) return false;
         if(n <= 3) return true;
         for(int i = 2; i <= Math.sqrt(n); i++) {
             if(n % i == 0)
                 return false;
         }
         return true;
    }

    // bai 5: gpt bac 2 ax2 + bx +c = 0
    public static void bai5(int a, int b, int c) {
         if(a == 0)
             System.out.println("khong phai phuong trinh bac 2 khong tinh");
         else {
             double denta = b*b - 4*a*c;
             if(denta == 0) {
                 System.out.printf("phuong trinh co nghiem kep x = %.2f",(double)-b/2*a );
             }
             else if(denta < 0) {
                 System.out.println("phuong trinh vo nghiem");
             }
             else {
                 double x1 = (-b + Math.sqrt(denta))/(2*a);
                 double x2 = (-b - Math.sqrt(denta))/(2*a);
                 System.out.printf("phuong trinh co nghiem kep \n x1 = %-20.2f x2 = %.2f",x1,x2);
             }
         }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // bai 1
        System.out.println("nhap so nguyen can kiem tra");
        int so1 = scanner.nextInt();
        bai1(so1);

        // bai 2
        System.out.println("nhap 3 canh a, b , c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        bai2(a,b,c);

        // bai 4 check so nguyen to

        System.out.println("nhap so nguyen can kiem tra so nguyen to");
        int n = scanner.nextInt();
        if(checkSNT(n)) {
            System.out.println(n + "la so nguyen to");
        } else {
            System.out.println(n + "khong la so nguyen to");
        }


        // bai 3 kiem tra chia het 3 va 5
        System.out.println("nhap so mua kiem tra 3 va 5");
        int dem = scanner.nextInt();
        bai3(dem);

        // bai 5 ptb2

        System.out.println("nhap 3 he so a , b ,c cua ptb2");
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();

        bai5(a1,a2,a3);
    }
}
