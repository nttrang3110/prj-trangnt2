package Java;
import java.util.Scanner;
public class JavaBai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương:");
        int n = scanner.nextInt();
        double tich = 1;
        if (n>0){
            for (int i = 1; i <= n; i++){
                tich = tich * i;
            }
            System.out.println("Giai thừa n!: " + tich);
        } else {
            System.out.println("Vui lòng nhập số nguyên dương");
        }
    }
}

