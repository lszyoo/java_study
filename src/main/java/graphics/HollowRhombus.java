package graphics;

public class HollowRhombus {
    public static void main(String[] args) {
        printHollowRhombus(5);
    }

    /**
     * 1、打印空心菱形，形如：
     *                &&*
     *                &* *
     *                *   *
     *                &* *
     *                &&*
     *  2、int类型 / int类型 = 取整    可强转，为double
     *     int类型 / double类型 = double类型
     *
     * @param size  空心菱形的高度（只能为奇数）
     */
    public static void printHollowRhombus(int size) {
        System.out.println((double)size/2);
        if (size % 2 == 0)
            size++;
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = size/2 + 1; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                if (j == 0 || j == i * 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            // 打印完一行之后再下一行
            System.out.println();
        }
        for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++)
                System.out.print(" ");
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
                if (j == 0 || j == 2 * (size - i -1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

