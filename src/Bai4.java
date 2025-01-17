import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour =scanner.nextInt();
        int minute =scanner.nextInt();
        int second = scanner.nextInt();
        int ans = second + 60*minute + 3600*hour;
        System.out.println(ans);
        scanner.close();
    }
}
