import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double seconds = scanner.nextDouble();
        double hours = seconds / 3600;
        double minutes = seconds / 60;
        System.out.printf("%.4f", hours);
        System.out.println();
        System.out.printf("%.4f", minutes);
        scanner.close();
    }
}
