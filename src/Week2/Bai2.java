package Week2;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];
        int n=0;
        int negativeValue;
        int maxValue = numbers[0];
        //nhap
        boolean check = true;
        menu();
        while (check){
            int function = scanner.nextInt();
            //1. Nhap
            if (function == 1){
                System.out.println("Nhap so phan tu trong mang: ");
                n = scanner.nextInt();
                for (int i = 0;i<n;i++){
                    numbers[i] = scanner.nextInt();
                }
            }// 2. Xuat mang
            else if (function == 2){
                for (int i = 0;i<n;i++){
                    System.out.printf("%d ", numbers[i]);
                }
                System.out.println();
            }// 3. Tim phan tu am dau tien
            else if (function == 3){
                boolean negCheck = false;
                for (int i =0;i<n;i++){
                    if (numbers[i]<0){
                        System.out.println(numbers[i]);
                        negCheck =true;
                        break;
                    }

                }
                if (!negCheck) System.out.println("Mang khong co phan tu am");
            }
            //4. Tim nhung vi tri max
            else if (function == 4){
                for (int i = 1;i<n;i++){
                    maxValue = maxValue > numbers[i] ? maxValue : numbers[i];
                }
                for (int i = 0;i<n;i++){
                    if (maxValue == numbers[i]){
                        System.out.printf("%d ", i+1);
                    }
                }
                System.out.println();
            }//5. Tinh tong
            else if (function == 5){
                int sumNumber =0;
                for (int i =0;i<n;i++){
                    sumNumber+=numbers[i];
                }
                System.out.println(sumNumber);
            }//6. Sap xep
            else if (function==6){
                for (int i =0;i<n-1;i++){
                    for (int j = 0;j<n-i-1;j++){
                        if (numbers[j]>numbers[j+1]){
                            int temp = numbers[j];
                            numbers[j] = numbers[j+1];
                            numbers[j+1]=temp;
                        }
                    }
                }
                for(int i = 0;i<n;i++){
                    System.out.printf("%d ", numbers[i]);
                }
                System.out.println();
            }
            else if (function==0){
                check = false;
            }
        }
        scanner.close();
    }
    static void menu(){
        System.out.println("----------------MENU--------------");
        System.out.println("1. Nhap mang");
        System.out.println("2. Xuat mang");
        System.out.println("3. Tim phan tu am dau tien trong mang");
        System.out.println("4. Xuat ra vi tri cac phan tu lon nhat");
        System.out.println("5. Tinh tong phan tu trong mang");
        System.out.println("6. Sap xep mang tang dan");
        System.out.println("0. Ket thuc");
        System.out.println("-----------------------------------");
    }
}
