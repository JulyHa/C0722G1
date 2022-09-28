package C07_14092022;

import java.util.InputMismatchException;
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
        int id = 0;
        while (true){
            try{
                id = Integer.parseInt(sc.nextLine());
                if(id < 0){
                    System.out.println("Lỗi");
                }
                else {
                    break;
                }
            }  catch (NumberFormatException e){
                System.out.println("Lỗi");
            }
        }
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int age=0;
        while (true){
            try{
                age = Integer.parseInt(sc.nextLine());
                if(age < 0 || age > 60){
                    System.out.println("Lỗi");
                }
                else break;
            }catch (NumberFormatException e){
                System.out.println("Lỗi");
            }
        }

        System.out.print("Nhập địa chỉ: ");
        String add = sc.nextLine();

        System.out.print("Nhập loại nhân viên(1. Fulltime    2. Parttime) : ");
        int loai = 0;
        while (true){
            try {
                loai = Integer.parseInt(sc.nextLine());
                if(loai != 1 && loai != 2){
                    System.out.println("Lỗi");
                }
                else break;
            }catch (NumberFormatException e){
                System.out.println("Lỗi");
            }
        }

        if(loai == 1 ){
            System.out.print("Nhập lương: ");
            double luong = 0.0;
            while(true){
                try{
                    luong = Double.parseDouble(sc.nextLine());
                    if(luong < 0){
                        System.out.println("Lỗi");
                    }
                    else break;
                }catch (NumberFormatException e){
                    System.out.println("Lỗi");
                }
            }

            arrNV[sl] = new FullTime(id, name, age, add, luong);
            sl++;
        }
        else {
            System.out.print("Nhập số ngày đi làm: ");
            int ngay = 0;
            while(true){
                try{
                    ngay = Integer.parseInt(sc.nextLine());
                    if(ngay < 0 || ngay > 31){
                        System.out.println("Lỗi");
                    }
                    else break;
                }catch (NumberFormatException e){
                    System.out.println("Lỗi");
                }
            }

            arrNV[sl] = new PartTime(id, name, age, add, ngay);
            sl++;
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("------------------Menu--------------------");
        System.out.println("1. Hiển thị nhân viên");
        System.out.println("2. Thêm nhân viên");
        System.out.println("3. Thoát");


        while(true) {

            System.out.println("Mời bạn nhập lựa chọn: ");
            int choice = 0;
            try{
                choice = Integer.parseInt(sc.nextLine()); //Luận
            }catch(NumberFormatException | InputMismatchException e) {
                continue;
            }
            switch (choice) {
                case 1:
                    showNV();
                    break;

                case 2:

                    int slnv = 0;
                    while(true){
                        System.out.print("Bạn muốn thêm bao nhiêu nhân viên: ");
                        try {
                            slnv = Integer.parseInt(sc.nextLine());
                            if(slnv < 0){
                                System.out.println("Lỗi!");
                            }
                            else break;
                        }catch (NumberFormatException e){
                            System.out.println("Lỗi!");
                        }
                    }

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
