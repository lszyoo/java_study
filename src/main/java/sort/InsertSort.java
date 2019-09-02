package sort;

/**
 * 直接插入排序是将未排序的数据插入至已排好序序列的合适位置。
 *
 * 具体流程如下：
 *
 * 1、首先比较数组的前两个数据，并排序；
 *
 * 2、比较第三个元素与前两个排好序的数据，并将第三个元素放入适当的位置；
 *
 * 3、比较第四个元素与前三个排好序的数据，并将第四个元素放入适当的位置；
 *
 * ......
 *
 * 4、直至把最后一个元素放入适当的位置。
 *
 * 平均时间复杂度：O(n²)
 * 空间复杂度：O(1)
 *
 * 直接插入排序是稳定的。
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = insertSort(new int[]{3, 5, 1, 7, 10});
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // 从小到大排列
    public static int[] insertSort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            // 数组 arr 的前 0至i-1 位已经排好序，从第 i 位开始依次遍历比较之前排好序的部分，并插入
            for(int j = i; j >= 0; j--){
                // 新数组 长度为i，倒序遍历比较，插入，并且新数组增长1
                if(arr[j] < arr[j-1]){
                    // 将新增元素前移，直至新增元素比新数组元素大的下标位置
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
