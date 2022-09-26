import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        float a;
        a =sc.nextFloat();
        float area = a*a ;
        System.out.println("Area la:" +area);
        float chuVi = 4*a;
        System.out.println("Chu vi la: " +chuVi);
    }
}
