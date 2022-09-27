package C07_27092022;

import java.util.ArrayList;
import java.util.Comparator;

public class QLPTGT {
    private ArrayList<Xe> phuongTien = new ArrayList<>();

    public void them(Xe newXe){
        phuongTien.add(newXe);
    }
    public boolean sua(Xe oldXe, Xe newXe){
        for (int i=0; i<phuongTien.size(); i++){

            if(phuongTien.get(i).getID() == oldXe.getID())
            {
                if((phuongTien.get(i) instanceof Oto && oldXe instanceof  Oto) ||
                        (phuongTien.get(i) instanceof XeMay && oldXe instanceof  XeMay) ||
                        (phuongTien.get(i) instanceof XeTai && oldXe instanceof  XeTai)) {
                    phuongTien.set(i, newXe);
                    return true;
                }
            }

        }
        return false;
    }
    public boolean xoa(int id) {
        for (Xe x : phuongTien) {
            if (x.getID() == id) {
                phuongTien.remove(x);
                return true;
            }
        }
        return false;
    }
    public void sapXep(){
        for(int i = 0; i<phuongTien.size()-1; i++){
            for(int j=i+1; j<phuongTien.size(); j++){
                if(phuongTien.get(i).getID() > phuongTien.get(j).getID()){
                    Xe tmp = phuongTien.get(i);
                    phuongTien.set(i, phuongTien.get(j));
                    phuongTien.set(j, tmp);
                }
            }
        }
    }
    public void hienThi(){
        for (Xe x : phuongTien){
            System.out.println(x);
        }
    }
    public ArrayList<Xe> timKiem(String hsx, String mau){
        ArrayList<Xe> kq = new ArrayList<>();
        for (Xe x : phuongTien){
            if(x.getHsx().equals(hsx) && x.getMau().equals(mau)){
                kq.add(x);
            }
        }
        return kq;
    }
    public ArrayList<Xe> tinKiemTheoId(int id){
        ArrayList<Xe> kq = new ArrayList<>();
        for (Xe x : phuongTien){
            if(x.getID() == id){
                kq.add(x);
            }
        }
        return kq;
    }
}
