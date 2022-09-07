package C07_07092022;

public class TimMaxMin {
    public static void main(String[] args) {
        int[] arr = {1,3,4,-4,22,63,-42};
        int gtMax = 0;
        int gtMin = 0;
        for (int i = 0; i<arr.length; i++) {
        if(gtMax < arr[i]){
            gtMax = arr[i];
        }
        if(gtMin > arr[i]){
            gtMin = arr[i];
        }
    }
        System.out.println("max = " + gtMax);
        System.out.println("min = " + gtMin);
    }

}
