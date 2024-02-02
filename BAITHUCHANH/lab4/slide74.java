package BAITHUCHANH.lab4;
import java.util.Scanner;

public class slide74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        System.out.println("Nhập các phần tử của mảng:");
        for (int index = 0; index < numbers.length; ++index) {
            numbers[index] = input.nextInt();
        }
        
        int totalEven = 0; 
        
        for (int index = 0; index < numbers.length; ++index) {
            if (numbers[index] % 2 == 0) { 
                totalEven += numbers[index];
            }
        }
        
        System.out.println("Tổng các số chẵn: " + totalEven);
        
        input.close();
    }
}
