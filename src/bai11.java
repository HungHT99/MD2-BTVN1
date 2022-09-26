import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
//        try {
//            Scanner sc = new Scanner(System.in);
//            float dienSuDung = 0, tienTra = 0;
//            System.out.print("Nhập vào số điện sử dụng của tháng: ");
//            dienSuDung = sc.nextFloat();
//            if (dienSuDung < 50) {
//                tienTra = dienSuDung * 700;
//                System.out.printf("Số tiền điện phải trả của tháng này là: %.2f", tienTra);
//            } else {
//                tienTra = 50 * 1000 + (dienSuDung - 50) * 1200;
//                System.out.printf("Số tiền điện phải trả của tháng này là: %.2f", tienTra);
//            }
//        } catch (Exception ex) {
//            System.out.print("Vui long nhap so!");
//        }
        Scanner sc = new Scanner(System.in);
        float dienSuDung = 0, tienTra = 0;
        System.out.print("Nhap so dien su dung: ");
        dienSuDung = sc.nextFloat();
        if (dienSuDung <= 50){
            tienTra = dienSuDung * 700;
            System.out.printf("So tien phai tra la: %.2f", tienTra );
        }if (dienSuDung <100){
            tienTra = dienSuDung * 900;
            System.out.printf("So tien phai tra la: %.2f", tienTra);
        }else if (dienSuDung <150){
            tienTra = dienSuDung * 1100;
            System.out.printf("So tien phai tra la: %.2f",tienTra);
        }else{
            tienTra = dienSuDung * 1300;
            System.out.printf("So tien phai tra la: %.2f", tienTra);
        }

    }
}

