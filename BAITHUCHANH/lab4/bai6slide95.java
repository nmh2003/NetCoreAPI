package BAITHUCHANH.lab4;

import java.util.Scanner;

public class bai6slide95 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        
        int total = 1;

        
        int i = 1;

        
        while (i <= n) {
            
            total = total * i;
            
            i = i + 1;
        }

        System.out.println(total);
        input.close();
    }
    
}