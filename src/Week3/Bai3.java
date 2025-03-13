package Week3;
import java.util.Scanner;

public class Bai3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 3 số từ người dùng
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số c: ");
        int c = scanner.nextInt();

        // Sắp xếp theo thứ tự tăng dần
        sapXep(a, b, c);
    }

    public static void sapXep(int a, int b, int c) {
        // So sánh và hoán đổi nếu cần
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // In kết quả
        System.out.println("Thứ tự tăng dần: " + a + ", " + b + ", " + c);
    }
}