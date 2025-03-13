package Week3;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double second, minute, hour;
        boolean isValidTime;

        do {
            System.out.println("Nhap gio, phut, giay (cach nhau boi dau cach):");
            hour = scanner.nextDouble();
            minute = scanner.nextDouble();
            second = scanner.nextDouble();

            isValidTime = true; // Giả sử thời gian hợp lệ ban đầu

            if (0 > second || second >= 60 || minute < 0 || minute >= 60 || 0 > hour || hour >= 24) {
                System.out.println("Thoi gian nhap khong hop le.");
                isValidTime = false;
            }

        } while (!isValidTime);

        System.out.printf("%.0f:%.0f:%.2f", hour, minute, second);
        scanner.close();
    }
}