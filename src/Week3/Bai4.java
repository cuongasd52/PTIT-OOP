package Week3;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int ans = 0;
        while(a>0){
            int d = a%10;
            a/=10;
            ans = Math.max(ans, d);
        }
        System.out.println(ans);
        scanner.close();
    }
}
