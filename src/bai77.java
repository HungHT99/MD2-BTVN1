import java.util.Scanner;

public class bai77 {
    public static boolean checkYear(int nam){
        return (nam % 4 == 0 && nam %100 !=0) || nam % 400 == 0;
    }
    public static void main(String[] args) {
        int month, year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang :");
        month = sc.nextInt();
        System.out.print("Nhap nam :");
        year = sc.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("La thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("La thang co 30 ngay");
                break;
            case 2:
                if (checkYear(year)){
                    System.out.print("La thang co 29 ngay");
                }else{
                    System.out.print("La thang co 28 ngay");
                }
                break;
            default:
                System.out.print("!!!!!");
        }
    }
}
