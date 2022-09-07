package C07_07092022;

import static java.lang.Math.sqrt;

public class TimSNT {
//    public static boolean checkSNT(int x){
//        if(x<2) return false;
//        if(x==2) return true;
//        for(int i = 2; i< x; i++){
//            if(x % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        int[] arr = new int[]{2,1,3,5,7,23,6,8,11,17,21};
//        for(int i=0; i<arr.length; i++){
//            if(checkSNT(arr[i]) == true){
//                System.out.println(arr[i] + " là số nguyên tố");
//            }
//        }
//
//    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,1,3,5,7,23,6,8,11,17,21};
        for (int i=0; i<arr.length; i++){
            boolean check = true;
            if(arr[i] < 2) {
                check = false;
            }
            else if(arr[i] > 2){
                for(int j = 2; j<sqrt(arr[i]); j++){
                    if(arr[i] % j == 0){
                        check = false;
                        break;
                    }
                }
            }
            if(check == true){
                System.out.println(arr[i] + " là số nguyên tố");
            }

        }
    }

}
