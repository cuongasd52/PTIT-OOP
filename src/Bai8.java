import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n%2==0){
            System.out.println("So chan");
        }
        else System.out.println("So le");

        scanner.close();
    }
}
