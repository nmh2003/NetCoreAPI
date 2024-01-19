package BAITHUCHANH.lab2;

import java.util.Scanner;

public class bai2trang92 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a = ");
        
        int a = input.nextInt();
        if (a % 2==0) {
            System.out.println("a chẵn");
        }
        else {
            System.out.println("a lẻ");
            
        }
        input.close();
    }
}
