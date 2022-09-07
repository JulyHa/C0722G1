package C07_07092022;

import java.util.Arrays;

public class DaoNguocMang {
    public static void main(String[] args) {
        int[] arr = {1,3,4,-4,22,63,-42};
        for(int i = 0; i< arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
