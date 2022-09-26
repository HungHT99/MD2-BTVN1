import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so :");
        int n = sc.nextInt();
        int result = reserver_num(n);
        System.out.println("So dao nguoc la:" +result);

    }

    private static int reserver_num(int n) {
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse;
    }
}
