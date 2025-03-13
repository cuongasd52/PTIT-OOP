package Week3;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Year = scanner.nextInt();
        leapYear(Year);

    }
    public static void leapYear(int Year){
        int isLeapYear = 0;
        if (Year%4==0&& Year%100!=0|| Year%400==0){
            isLeapYear = 1;
        }
        switch (isLeapYear){
            case 1:
                System.out.println(Year + " la nam nhuan");
                break;
            case 0:
                System.out.println(Year + " khong la nam nhuan");
                break;
        }
    }
}
