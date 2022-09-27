package C07_27092022;

public class XeMay extends Xe{
    private int congSuat;

    public XeMay() {
    }

    public XeMay(int ID, String hsx, int nsx, double gia, String mau, int congSuat) {
        super(ID, hsx, nsx, gia, mau);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    @Override
    public String toString() {
        return super.toString() + ", congSuat=" + congSuat;
    }

}
