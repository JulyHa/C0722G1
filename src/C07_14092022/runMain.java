package C07_14092022;

import java.util.Scanner;

public class runMain {
    static QLNhanVien[] arrNV = new QLNhanVien[1000];
    static int sl = 0;
    public static void showNV(){
        if(sl == 0) System.out.println("Không có nhân viên!");
        else {
            for (int i = 0; i < sl; i++) {
                System.out.println(arrNV[i]);
            }
        }
    }

    public static void themNV(Scanner sc) {
        System.out.print("Nhập id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String add = sc.nextLine();

        System.out.print("Nhập loại nhân viên(1. Fulltime    2. Parttime) : ");
        int loai = sc.nextInt();
        if(loai == 1 ){
            System.out.print("Nhập lương: ");
            double luong = sc.nextDouble();
            arrNV[sl] = new FullTime(id, name, age, add, luong);
            sl++;
        }
        else {
            System.out.print("Nhập số ngày đi làm: ");
            int ngay = sc.nextInt();
            arrNV[sl] = new PartTime(id, name, age, add, ngay);
            sl++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("------------------Menu--------------------");
        System.out.println("1. Hiển thị nhân viên");
        System.out.println("2. Thêm nhân viên");
        System.out.println("3. Thoát");


        while(true) {
            System.out.println("Mời bạn nhập lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    showNV();
                    break;

                case 2:
                    System.out.print("Bạn muốn thêm bao nhiêu nhân viên: ");
                    int slnv = sc.nextInt();
                    for (int i = 0; i < slnv; i++) {
                        themNV(sc);
                    }
                    showNV();
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
