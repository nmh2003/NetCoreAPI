package BAITHUCHANH.lab3;
import java.util.Scanner;
public class bthslide35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a = ");
        double a = input.nextDouble();
        
        System.out.println("b = ");
        double b = input.nextDouble();
        if (a>b) {
            System.out.println(a);
            
        }
        else {
            System.out.println(b);
        }
    }
}
