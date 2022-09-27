package C07_27092022;

public class Oto extends Xe{
    private int soCho;
    private int kieuDongCo;

    public Oto() {
    }

    public Oto(int ID, String hsx, int nsx, double gia, String mau, int soCho, int kieuDongCo) {
        super(ID, hsx, nsx, gia, mau);
        this.soCho = soCho;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public int getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(int kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public String toString() {
        return super.toString() + ", soCho=" + soCho +
                ", kieuDongCo=" + kieuDongCo;
    }
}
