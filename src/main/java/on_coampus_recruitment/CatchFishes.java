package on_coampus_recruitment;

/**
 * A��B��C��D��E����˲�������賿����ұ�˯����
 * ����A��һ��������������ֳ���ݣ��Ѷ����һ�����ӵ��������Լ���һ�ݣ�
 * B�ڶ���������Ҳ�������Ϊ��ݣ��Ѷ����һ�����ӵ��������Լ���һ�ݡ�
 * CDE����������Ҳ��ͬ���ķ������㣬�����Ǻϻ����ٲ��˼����㣬�Լ�ÿ��������ʱ���˶������㣿
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
                System.out.println("���ٺϻﲶ�㣺" + n + "��");
                System.out.println("A��B��C��D��E �ֱ������������" + n + "��" + j + "��" + k + "��" + l + "��" + m + "��");
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
