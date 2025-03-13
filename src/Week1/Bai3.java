import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int donvi = x%10;
        int chuc = x/10;
        int answer =chuc + donvi;
        System.out.println(answer);

        scanner.close();
    }
}
