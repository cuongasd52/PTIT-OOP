package Week3;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Distance = scanner.nextDouble();
        System.out.println(taxiPrice(Distance));
        scanner.close();
    }
    public static double taxiPrice(double Distance){
        if (Distance <=1) return 17000*Distance;
        else if (Distance >1 && Distance <=30) return 17000 + (Distance - 1)*15000;
        return 17000 + 15000*29 + (Distance -30) *12000;
        }
}

