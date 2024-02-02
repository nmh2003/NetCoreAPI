package BAITHUCHANH.lab4;

import java.util.Scanner;

public class bai10slide95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap: ");
        String str = scanner.nextLine();
        if (str.length() > 80) {
            System.out.println("Nhap lai");
            return; 
        }
        
        System.out.print("Nhập một ký tự: ");
        char ch = scanner.next().charAt(0);
        
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
