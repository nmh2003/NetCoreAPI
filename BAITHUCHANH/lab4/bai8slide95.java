package BAITHUCHANH.lab4;

import java.util.Scanner;

public class bai8slide95 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("So phan tu:");
        int n = input.nextInt();
        int[] numbers = new int[n];
        
        System.out.println("Nhập các phần tử của mảng:");
        for (int index = 0; index < numbers.length; ++index) {
            numbers[index] = input.nextInt();
        }
        
         
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        
        
        double average = (double) sum / n;
        System.out.println(average);
        
        input.close();
    }
}
