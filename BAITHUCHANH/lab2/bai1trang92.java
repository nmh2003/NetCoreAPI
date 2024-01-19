package BAITHUCHANH.lab2;

import java.util.Scanner;

public interface bai1trang92 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a = ");
        double a = input.nextDouble();
        
        System.out.println("b = ");
        double b = input.nextDouble();
        double tong = a+b;
        double hieu= a-b;
        double tich= a*b;
        double thuong= a/b;
        double chialaydu = a%b;
        System.out.println("Tổng "+ tong);
        System.out.println("Hiệu " +hieu);
        System.out.println("Tích" +tich);
        System.out.println("Thương " +thuong);
        System.out.println("Dư" +chialaydu);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        input.close();
    }
}
