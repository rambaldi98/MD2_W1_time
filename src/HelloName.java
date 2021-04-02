import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        int a = 5;

       // 1 printf sau khi hien thi con tro khong xuong dong

        System.out.print(a);
        System.out.print(a);
        System.out.print("hello");
        System.out.print( a +'h' + a);
        // 2. println sau khi hien thi xong xuong dong
        System.out.println("hello" +a); // in xong con tro xuong dong
        System.out.println("hello");

        // 3. printf dinh dang doi so truyen vao

//        %c: Ký tự
//%d: Số thập phân (số nguyên) (cơ số 10)
//%e: Dấu phẩy động theo cấp số nhân
// %f: Dấu phẩy động
// %i: Số nguyên (cơ sở 10)
//%o: Số bát phân (cơ sở 8)
// %s: Chuỗi
// %u: Số thập phân (số nguyên) không dấu
//%x: Số trong hệ thập lục phân (cơ sở 16)
// %t: Định dạng ngày / giờ
// %%: Dấu phần trăm
// \%: Dấu phần trăm


        //System.out.printf(a); //errror
        System.out.printf("%d",a); // khong loi
        // 4. fomat
        System.out.format("hello wold");


    }
}
