import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        float b;
        System.out.println("Nhap a");
        System.out.println("Nhap b");
        a = sc.nextFloat();
        b = sc.nextFloat();
        float area = a*b;
        System.out.println("Area la" +area);
        float chuVi = (a+b)*2;
        System.out.println("Chu Vi la" +chuVi);
    }
}
