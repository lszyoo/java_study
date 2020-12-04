package algorithm.test;

public class Test20201201 {
    public static void main(String[] args) {
        System.out.println(strContains("asmdddfd", "ddd"));
        System.out.println(ten2Three(9));

        int[][] arr = new int[10][8];
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        yanghuiTriangle(5);
    }

    public static boolean strContains(String a, String b) {
        if (a == null || a.length() == 0) {
            return false;
        }
        if (b == null || b.length() == 0) {
            return false;
        }

        int m = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(m)) {
                m++;
            } else {
                m = 0;
            }
            if (m == b.length()) {
                return true;
            }
        }
        return false;
    }

    public static String ten2Three(int m) {
        StringBuffer sb = new StringBuffer();
        if (m <= 0) {
            return null;
        }

        while (m >= 3) {
            int n = m % 3;
            if (n == 0) {
                sb.append("a");
            }
            if (n == 1) {
                sb.append("b");
            }
            if (n == 2) {
                sb.append("c");
            }
            m = m / 3;
        }

        if (m < 3) {
            if (m == 1) {
                sb.append("b");
            }
            if (m == 2) {
                sb.append("c");
            }
        }

        return sb.reverse().toString();
    }

    public static void yanghuiTriangle(int m) {
        int[][] arr = new int[m][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
