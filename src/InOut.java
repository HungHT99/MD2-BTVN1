import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
//        // In ra cau xin chao cac ban
//        System.out.print("Xin chao cac ban");
//        //
//        System.out.println("Hello Word");
//        //
//        String studentId = "001";
//        String studentName = "Thai Hung";
//        int age = 10;
//        float m = 8.7f;
//        System.out.printf("Ma SV: %s - Ten Sv: %s, Tuoi: %d, Diem: %f", studentId,studentName,age,m);

        ////Nhap thong tin gom ten tuoi, ma sv gioi tinh
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        String studentId = scanner.nextLine();

        System.out.println("Nhap ten sinh vien");
        String studentName = scanner.nextLine();

        System.out.println("Nhap vao gioi tinh");
        boolean sex = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(" Nhap tuoi sinh vien");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap vao dia chi sv");
        String address = scanner.nextLine();

        System.out.printf("Ma sv: %s - Ten sv: %s - Gioitinh: %b\n - Dia chi: %s", studentId,studentName,sex,address);
    }
}
