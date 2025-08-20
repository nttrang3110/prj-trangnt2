package Java;

import java.util.Scanner;

public class JavaBai2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chiều dài: ");
            double a = scanner.nextDouble();
            System.out.println("Chiều rộng: ");
            double b = scanner.nextDouble();
            double dien_tich = a * b;
            System.out.println("Diện tích hình chữ nhật là: " + dien_tich);
            scanner.close();
        }
    }

