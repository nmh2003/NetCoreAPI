package BAITHUCHANH.lab4;

import java.util.Scanner;

public class slide90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Nhap: ");
        String str = scanner.nextLine();
        
        
        
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        
        scanner.close();
    }
    
}
