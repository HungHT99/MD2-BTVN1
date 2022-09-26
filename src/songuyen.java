import java.util.Scanner;

public class songuyen {
    //    public static void main(String[] args) {
//        //kiem tra so nguyen
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao 1 so nguyen");
//        int num = sc.nextInt();
//        if (num%2==0){
//            System.out.println("La so chan");
//        }else {
//            System.out.println("La so le");
//        }
//    }
    public static void main(String[] args) {
        // nhap vao so tu 1-9, phien am so do
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen");
        int num = sc.nextInt();
        switch (num) {
            case 0:
                System.out.println("khong");
                break;
            case 1:
                System.out.println("mot");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("boon");
                break;
            case 5:
                System.out.println("nam");
                break;
            case 6:
                System.out.println("sau");
                break;
            case 7:
                System.out.println("bay");
                break;
            case 8:
                System.out.println("tam");
                break;
            default:
                System.out.println("chin");
                break;
        }
    }
}
