package BAITHUCHANH.lab3;

import java.util.Scanner;

public interface bthslide30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n = ");
        int n = input.nextInt();
        
        if (n <= 0) {
            System.out.println("Nhap n > 0");
            return;
            
        }
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10; 
            sum += digit; 
            temp /= 10; 
        }

        
        System.out.println("Tong cac chu so trong " + n + ": " + sum);
        input.close();

        

        
        
        
    }
}

