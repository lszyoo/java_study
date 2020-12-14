//package algorithm;
//
//import java.util.Random;
//
//public class Al_9_RandomRedPackage {
//    public static void main(String[] args) {
//
//    }
//
//    public static double[] randomRedPackage(int m, double total) {
//        if (m <= 0 || total <= 0) {
//            return null;
//        }
//
//        double[] arr = new double[m];
//        Random random = new Random();
//        for (int i = 0; i < m; i++) {
//            double tmp = 0;
//            for (int j = i; j >= 0; j--) {
//                tmp += arr[j];
//            }
//
//            double remain = total - tmp;
//            if (tmp < total) {
//                arr[i] = Math.random() * remain;
//            }
//            if ()
//        }
//    }
//}
