package Java;
import java.util.Scanner;
public class JavaBai7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên:");
        int n = scanner.nextInt();
        System.out.println("Bảng cửu chương của số nguyên đã nhập từ 1 đến 10: ");
        for (int i = 1; i <=10; i++){
            int tich = n * i;
            System.out.println(n + "x" + i + "=" + tich);
        }
    }
}

