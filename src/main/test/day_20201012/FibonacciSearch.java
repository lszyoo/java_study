package day_20201012;

import java.util.Arrays;

public class FibonacciSearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = Arrays.copyOf(a, b[2]);
        for (int i : c) {
            System.out.println(i);
        }
    }

    public static int[] fibonacci(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[n] = fibonacci[n - 1] + fibonacci[n - 2];
        }
        return fibonacci;
    }
}
