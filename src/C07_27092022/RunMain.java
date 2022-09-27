package C07_27092022;

import javafx.scene.transform.Scale;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    static QLPTGT ql = new QLPTGT();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ql.them(new Oto(1,"BMV", 2000, 100000, "red", 4, 100));
        ql.them(new XeMay(1,"BMV", 2000, 100000, "red", 10));

        System.out.println("----------------MENU--------------");
        System.out.println("1. Thêm xe");
        System.out.println("2. Sửa 1 xe");
        System.out.println("3. Xóa 1 xe");
        System.out.println("4. Tìm phương tiện theo hãng sản xuất và màu");
        System.out.println("5. Sắp xếp theo ID");
        System.out.println("6. Thoát");
        System.out.print("Nhập phím muốn chọn: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                case1(sc);
                break;
            case 2:
                System.out.print("Nhập ID xe cần sửa: ");
                int id = sc.nextInt();
                ArrayList<Xe> ketQua = ql.tinKiemTheoId(id);
                if(ketQua.size() == 0){
                    System.out.println("Không có xe nào có ID như trên!");
                }
                else {
                    for (int i = 0; i<ketQua.size(); i++){
                        System.out.println((i+1) + ": " + ketQua.get(i));
                    }
                    System.out.print("Nhập STT: ");
                    int stt = sc.nextInt();
                    Xe xeCanSua = ketQua.get(stt-1);
                    Xe newXe;
                    if(xeCanSua instanceof Oto){
                        // nhập thông tin xe mới là Oto
                        newXe = new Oto();
                    } else if (xeCanSua instanceof XeMay) {
                        // nhập thông tin mới là me máy
                       newXe = new XeMay();
                    }
                    else {
                        // nhập thông tin mới là xe tải
                        newXe = new XeTai();
                    }

                    ql.sua(xeCanSua, newXe );
                    ql.hienThi();
                }

                break;
            case 3:
                break;
            case 4:
                System.out.print("Nhập hãng xe: ");
                sc.nextLine();
                String hx = sc.nextLine();
                System.out.print("Nhập màu xe: ");
                String mau = sc.nextLine();
                ArrayList<Xe> kq = ql.timKiem(hx, mau);
                if(kq.size() == 0){
                    System.out.println("Không có!");
                }
                else {
                    for (Xe x : kq){
                        System.out.println(x);
                    }

                }


                break;
            case 5:
                ql.sapXep();
                ql.hienThi();
                break;
            case 6:
                break;
            default:
                System.out.println("Không có lựa chọn trên!");
        }
    }

    private static void case1(Scanner scanner) {
        System.out.print("Nhập ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String hsx = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int nsx = scanner.nextInt();
        System.out.print("Nhập giá bán: ");
        double giaBan = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập màu: ");
        String mau = scanner.nextLine();
        System.out.println("1. OTO\t 2.Xe máy\t 3.Xe tải");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.print("Nhập số chỗ ngồi: ");
                int soCho = scanner.nextInt();
                System.out.print("Nhập kiểu động cơ");
                int kieuDongCo = scanner.nextInt();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Không có lựa chọn trên!");
        }
    }
}
