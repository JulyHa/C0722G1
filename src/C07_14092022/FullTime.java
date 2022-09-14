package C07_14092022;

public class FullTime extends QLNhanVien{
    private double salary;

    public FullTime() {
    }

    public FullTime(int id, String name, int age, String address) {
        super(id, name, age, address);
    }

    public FullTime(int id, String name, int age, String address, double salary) {
        super(id, name, age, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + salary;
    }
}
