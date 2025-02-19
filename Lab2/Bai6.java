import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        double perimeter = 2*(width+height);
        double area = width*height;
        System.out.printf("%.3f", perimeter);
        System.out.println();
        System.out.printf("%.3f", area);

        scanner.close();
    }
}
