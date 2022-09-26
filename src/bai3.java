import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.println("Nhap a");
        a = sc.nextFloat();
        System.out.println("Nhap b");
        b = sc.nextFloat();
        float Tong = a+b;
        System.out.println("Tong la" +Tong);
        float Hieu = a-b;
        System.out.println("Hieu la" +Hieu);
        float Tich = a*b;
        System.out.println("Tich la" +Tich);
     }
}
