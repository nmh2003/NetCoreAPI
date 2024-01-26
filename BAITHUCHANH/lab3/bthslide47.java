package BAITHUCHANH.lab3;

import java.util.Scanner;

public class bthslide47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;

        while (true) {
        
            System.out.print("n = ");
            int n = input.nextInt();

            
            sum = sum + n;

            
            if (sum > 100) {
                break;
            }
        }
        System.out.println(sum);
    }
}
