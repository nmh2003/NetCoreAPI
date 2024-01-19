import java.util.Scanner;
public class PhuongTrinhBacHai {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a = ");
        double a = input.nextDouble();
        
        System.out.println("b = ");
        double b = input.nextDouble();

        System.out.println("c = ");
        double c = input.nextDouble();
        double delta = b * b - 4 * a * c;
        if (a == 0) {
           System.out.println("Không phải phương trình bậc 2");
        } else {
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2= " + x2);
                input.close();
        }
    }
    }
}
