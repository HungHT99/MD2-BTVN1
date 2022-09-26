import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.println(" nhap vao so a");
        a = sc.nextFloat();
        System.out.println(" nhap vao so b");
        b = sc.nextFloat();
        System.out.println(" nhap vao so b");
        c = sc.nextFloat();
        if (a < b + c && b < a + c && c < a + b) {

        } if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)

            System.out.println("day la tam giac vuong");

        else if (a == b && b == c)

            System.out.println("day la tam giac deu");

        else if (a == b || a == c || b == c)

            System.out.println("day la tam giac can");

        else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b)

            System.out.println("day la tam giac tu");

        else

            System.out.println("day la tam giac nhon");

    }
}
