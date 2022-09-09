package C07_09092022.Fan;

public class runFan {
    public static void main(String[] args) {
        Fan f1 = new Fan(3, true,10, "yellow");

        Fan f2 = new Fan();
        f2.setColor("red");
        System.out.println(f2);

    }
}
