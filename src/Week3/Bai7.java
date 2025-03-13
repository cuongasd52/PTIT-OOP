package Week3;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month, Year;
        while(true){
            try{
                month = scanner.nextInt();
                Year = scanner.nextInt();
                if (month>12||month<1){
                    throw new IllegalArgumentException("Nhap thang hop le!");
                }
                else break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        int isLeapYear = 0;
        if (Year%4==0&& Year%100!=0|| Year%400==0){
            isLeapYear = 1;
        }
        switch(month){
            case 1,3,5,7,8,10,12 -> System.out.println(31);
            case 4,6, 9,11 -> System.out.println(30);
            case 2->
            {if (isLeapYear==1){
                System.out.println(29);
            }
            else System.out.println(28);}
        }
    }
}
