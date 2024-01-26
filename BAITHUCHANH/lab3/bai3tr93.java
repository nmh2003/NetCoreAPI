package BAITHUCHANH.lab3;
import java.util.Scanner;
public class bai3tr93 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten:");
        String a = input.nextLine();
        System.out.println("Nhap tuoi = ");
        
        int b = input.nextInt();
        if (b<16) {
            System.out.println("Bạn"+ a + " ở độ tuổi vị thành niên");
        }
        else if (b>=16 && b<18) {
            System.out.println("Bạn"+ a + " ở độ tuổi trưởng thành");
            
        }
        else {
            System.out.println("Bạn"+ a + " đã già");
        }

    }
}
