package on_coampus_recruitment;

import java.util.Scanner;

/**
 * 给我们一堆石子，每次可以拿一个、两个或三个，两个人轮流拿，拿到最后一个石子的人获胜，现在给我们一堆石子的个数，问我们能不能赢。
 */
public class NimGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num / 4 != 0)
            System.out.println("必胜");
    }
}