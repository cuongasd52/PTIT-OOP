package Week3;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b= scanner.nextInt(), c= scanner.nextInt();
        checkTriangle(a,b,c);
        scanner.close();
    }
    public static void checkTriangle(int a, int b, int c){

         if (a==b&& b==c){
             System.out.println("Tam giac deu");
         }
         else if ((a*a + b*b == c*c) || (b*b + c*c == a*a) || (a*a + c*c == b*b)){
             System.out.println("Tam giac vuong");
         }
         else if (a==b ||a==c||b==c){
             System.out.println("Tam giac can");
         }
         else System.out.println("Tam giac binh thuong");
    }
}
