package C07_27092022;

public class Xe {
    private int ID;
    private String hsx;
    private int nsx;
    private double gia;
    private String mau;

    public Xe() {
    }

    public Xe(int ID, String hsx, int nsx, double gia, String mau) {
        this.ID = ID;
        this.hsx = hsx;
        this.nsx = nsx;
        this.gia = gia;
        this.mau = mau;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getHsx() {
        return hsx;
    }

    public void setHsx(String hsx) {
        this.hsx = hsx;
    }

    public int getNsx() {
        return nsx;
    }

    public void setNsx(int nsx) {
        this.nsx = nsx;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return "ID=" + ID +
                ", hsx='" + hsx +
                ", nsx=" + nsx +
                ", gia=" + gia +
                ", mau='" + mau ;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
