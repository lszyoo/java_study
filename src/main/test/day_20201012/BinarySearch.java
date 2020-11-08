package day_20201012;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7};
        System.out.println(find(arr, 3));
    }

    public static boolean find(int[] arr, int key) {
        if (arr.length == 0) {
            return false;
        }

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
