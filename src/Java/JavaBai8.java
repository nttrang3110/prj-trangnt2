package Java;

import java.util.Scanner;

public class JavaBai8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số nguyên:");
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <=n; i++){
                sum = sum + i;
            }
            System.out.println("Tổng các số từ 1 đến n là: " + sum);
        }
    }

