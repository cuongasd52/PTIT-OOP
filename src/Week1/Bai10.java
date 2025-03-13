import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            double ans = (double)(a+b+c+d)/4;
            System.out.printf("%.4f", ans);
            scanner.close();
    }
}
