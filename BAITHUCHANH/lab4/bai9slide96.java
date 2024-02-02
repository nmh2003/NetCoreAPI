package BAITHUCHANH.lab4;

import java.util.Scanner;

public class bai9slide96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Nhap: ");
        String str = scanner.nextLine();
        
        int thuong = 0;
        int hoa = 0;
        int so = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                thuong++;
            } else if (Character.isUpperCase(ch)) {
                hoa++;
            } else if (Character.isDigit(ch)) {
                so++;
            }
        }
        
        
        System.out.println("Số ký tự thường: " + thuong);
        System.out.println("Số ký tự hoa: " + hoa);
        System.out.println("Số ký tự số: " + so);
        
    }
}
