package BAITHUCHANH.lab4;
import java.util.Scanner;
public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("số hàng: ");
        int hang = scanner.nextInt();
        System.out.print("số cột: ");
        int cot = scanner.nextInt();
        
        
        int[][] matran = new int[hang][cot];
        
        
        System.out.println("Nhập phần tử :");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("Nhập phần tử tại vị trí [%d][%d]: ", i, j);
                matran[i][j] = scanner.nextInt();
            }
        }
        
        
        int maxElement = matran[0][0];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (matran[i][j] > maxElement) {
                    maxElement = matran[i][j];
                }
            }
        }
        System.out.println("max: " + maxElement);
        
        scanner.close();
    }
}
