package Java;

import java.util.Scanner;

public class JavaBai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 số nguyên:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Số lớn nhất trong 3 số đã nhập là: " + max);
        scanner.close();
    }
}


