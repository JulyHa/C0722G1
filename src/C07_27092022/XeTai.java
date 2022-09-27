package C07_27092022;

public class XeTai extends Xe{
    private int trongTai;

    public XeTai() {
    }

    public XeTai(int ID, String hsx, int nsx, double gia, String mau, int trongTai) {
        super(ID, hsx, nsx, gia, mau);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString() + "trongTai=" + trongTai;
    }
}
