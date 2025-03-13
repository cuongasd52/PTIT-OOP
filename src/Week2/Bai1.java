package Week2;
import java.util.Scanner;

public class Bai1 {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mark;
        while(true){
            try{
                mark  = scanner.nextDouble();
                if (mark<0 || mark >10){
                    //Ném ra ngoại lệ IllegalArgumentException với thông báo lỗi
                    //Có thể tạo một ngoại lệ khác ví d: DiemSoKhongHopLeException
                    throw new IllegalArgumentException("Diem so phai nam trong khoang 1 toi 10");
                }
                else break;

            }catch(IllegalArgumentException e){
                System.out.println("Loi: "+ e.getMessage());
            }

        }
        if (mark <5) System.out.println("Yeu");
        else if (5<= mark && mark<6.5) System.out.println("Trung binh");
        else if (6.5<= mark && mark<7) System.out.println("Trung binh kha");
        else if (7<= mark && mark<8) System.out.println("Kha");
        else if (8<= mark && mark<9) System.out.println("Gioi");
        else System.out.println("Xuat sac");
        scanner.close();
    }
}
