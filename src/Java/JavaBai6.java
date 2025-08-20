package Java;

import java.util.Scanner;

public class JavaBai6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm trung bình của học sinh: ");
        double diem = scanner.nextDouble();
        if (diem >= 8){
            System.out.println("Học sinh giỏi");
        } else if (diem >= 6.5){
            System.out.println("Học sinh khá");
        } else if (diem >=5){
            System.out.println("Học sinh trung bình");
        } else {
            System.out.println("Học sinh yếu");
        }
        scanner.close();
    }
}
