import java.util.Scanner;

public class bai9 {
    public static void change(int n){
        int h, m, s;
        h = n/3600;
        m = n % 3600 / 60;
        s = n % 3600 % 60;
        System.out.printf("Sau khi doi %d giay: %d : %d : %d", n , h,m,s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        System.out.print("\n\nNhap so can doi: ");
        s = sc.nextInt();
        change(s);
    }
}
