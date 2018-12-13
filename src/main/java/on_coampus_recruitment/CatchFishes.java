package on_coampus_recruitment;

/**
 * A、B、C、D、E五个人捕鱼后已凌晨，大家便睡觉。
 * 早上A第一个醒来，将鱼均分成五份，把多余的一条鱼扔掉，拿走自己的一份，
 * B第二个醒来，也将鱼均分为五份，把多余的一条鱼扔掉，拿走自己的一份。
 * CDE依次醒来，也按同样的方法拿鱼，问他们合伙至少捕了几条鱼，以及每个人醒来时见了多少条鱼？
 */
public class CatchFishes {
    public static void main(String[] args) {
        int j = 0, k = 0, l = 0, m = 0, n = 6, x = 0;
        while (n > 5) {
            j = 4 * (n - 1) / 5;
            k = 4 * (j - 1) / 5;
            l = 4 * (k - 1) / 5;
            m = 4 * (l - 1) / 5;
            if (n % 5 == 1 && j % 5 == 1 && k % 5 == 1 && l % 5 == 1 && m % 5 == 1) {
                System.out.println("至少合伙捕鱼：" + n + "条");
                System.out.println("A、B、C、D、E 分别见到条数：：" + n + "、" + j + "、" + k + "、" + l + "、" + m + "条");
                break;
            }
            n++;
        }
    }

    public static void judge(int sum) {
        sum = 6;
        int i = 0;
        while (sum > 5) {
            if (sum % 5 == 1) {

                judge((sum - 1) / 5 * 4);

            }

        }
    }
}