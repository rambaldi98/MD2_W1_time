import java.util.Scanner;

public class DocSoThanhChu {
    public static String docDonVi(int n){
        String str = "";
        switch (n) {
            case 1:
                str = "one";
                break;
            case 2:
                str = "true";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "fourt";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;

        }
    return str;
    }

    public static String doc11(int n){
        String str = "";
        switch (n) {

            case 11:
                str = "eleven";
                break;
            case 12:
                str = "twelve";
                break;
            case 13:
                str = "thirteen ";
                break;
            case 14:
                str = "fourteen";
                break;
            case 15:
                str = "fifteen ";
                break;
            case 16:
                str = "sixteen";
                break;
            case 17:
                str = "seventeen";
                break;
            case 18:
                str = "eighteen";
                break;
            case 19:
                str = "nineteen";
                break;

        }
        return str;
    }
    public static String docchuc(int n){
        String str = "";
        switch (n) {

            case 1:
                str = "ten";
                break;
            case 2:
                str = "twenty";
                break;
            case 3:
                str = "thirty ";
                break;
            case 4:
                str = "fourty";
                break;
            case 5:
                str = "fifty ";
                break;
            case 6:
                str = "sixty";
                break;
            case 7:
                str = "seventy";
                break;
            case 8:
                str = "eighty";
                break;
            case 9:
                str = "ninety";
                break;

        }
        return str;
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String str = "";
        int tram = num/100;
        int chuc = num - tram*100 ;
        int donVi = num%100;

        int hangChuc = chuc/10;
        int hangDonVi = chuc%10;
        if(tram >0) {

            str += docDonVi(tram) + " hundredth ";
        }
            if(chuc > 10 && chuc < 20) {
                str +=  doc11(chuc) +" ";
            }
            else {
                str += docchuc(hangChuc) + " " + docDonVi(hangDonVi);
            }
        System.out.println(str);
    }
}
