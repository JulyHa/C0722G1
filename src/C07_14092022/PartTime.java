package C07_14092022;

public class PartTime extends QLNhanVien{
    private int date;

    public PartTime() {
    }

    public PartTime(int date) {
        this.date = date;
    }

    public PartTime(int id, String name, int age, String address, int date) {
        super(id, name, age, address);
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString() + "date=" + date ;
    }
}
