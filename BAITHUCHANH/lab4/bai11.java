package BAITHUCHANH.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("So phan tu:");
        int n = input.nextInt();
        int[] numbers = new int[n];
        
        System.out.println("Nhập các phần tử của mảng:");
        for (int index = 0; index < numbers.length; ++index) {
            numbers[index] = input.nextInt();
            
        }
        System.out.print("mang truoc ");
        for (int num : numbers) {
            System.out.print(num);
        }
        System.out.print("\nmang sau ");
        Arrays.sort(numbers);
        for (int num : numbers) {
            System.out.print(num);
        }
        
    }
}
