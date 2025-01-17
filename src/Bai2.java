import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int tram=x/100; int du=x%100;
        int chuc = du/10;
        int donvi = du%10;
        System.out.printf("Hang tram: %d, hang chuc: %d, hang don vi: %d",
                tram, chuc, donvi);
        scanner.close();
    }
}
