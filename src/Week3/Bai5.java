package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        while(a>0){
            int d = a%10;
            a/=10;
            num.add(d);
        }
        Collections.sort(num);
        for(Integer x: num){
            System.out.printf("%d ", x);
        }
        System.out.println();
        scanner.close();
    }
}
