package on_coampus_recruitment;

/**
 * A、B、C、D、E 五个人捕鱼后已凌晨，大家便睡觉。
 * 早上 A 第一个醒来，将鱼均分成五份，把多余的一条鱼扔掉，拿走自己的一份，
 * B 第二个醒来，也将鱼均分为五份，把多余的一条鱼扔掉，拿走自己的一份。
 * C、D、E 依次醒来，也按同样的方法拿鱼，问他们合伙至少捕了几条鱼，以及每个人醒来时见了多少条鱼？
 */
public class CatchFishes {
    public static void main(String[] args) {
        // 假定 A、B、C、D、E 分别看到 j、k、l、m、n
        int j = 6, k = 0, l = 0, m = 0, n = 0;
        while (j > 5) {
            k = 4 * (j - 1) / 5;
            l = 4 * (k - 1) / 5;
            m = 4 * (l - 1) / 5;
            n = 4 * (m - 1) / 5;
            // 找出最小值
            if (j % 5 == 1 && k % 5 == 1 && l % 5 == 1 && m % 5 == 1 && n % 5 == 1) {
                System.out.println("至少合伙捕鱼：" + j + "条");
                System.out.println("A、B、C、D、E 分别见到条数：：" + j + "、" + k + "、" + l + "、" + m + "、" + n + "条");
                break;
            }
            j++;
        }
    }
}