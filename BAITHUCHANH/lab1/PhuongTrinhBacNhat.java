import java.util.Scanner;
public class PhuongTrinhBacNhat {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a = ");
        double a = input.nextDouble();
        
        System.out.println("b = ");
        double b = input.nextDouble();
        
        if (a == 0) {
           System.out.println("Không phải phương trình bậc 1");
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
            input.close();
        }
    }
}
