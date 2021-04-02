import java.util.Scanner;

public class ChiSoCanNang {
    public static float BMI(double weight, double height) {

        return (float) (weight / Math.pow(height,2));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double width = s.nextDouble();
        double height = s.nextDouble();
        float bmi =  BMI(width,height);
        if(bmi < 18.5)
            System.out.println("Underweight");
        else if(bmi >= 18.5 && bmi < 25)
            System.out.println("Normal");
        else if(bmi >= 25 && bmi < 30)
            System.out.println("Overweight");
        else
            System.out.printf("Obese");
    }
}
