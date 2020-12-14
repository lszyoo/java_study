package algorithm;

import java.util.Arrays;

public class Al_8_LongestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcdefg", "m"));
        System.out.println(longestCommonSubstring("abcdefg", "bcdm"));
        System.out.println(lengthOfLis(new int[]{2, 5, 3, 4, 1, 7, 6}));
    }

    /**
     * 公共子序列
     * @param a
     * @param b
     * @return
     */
    public static int longestCommonSubsequence(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c1 = a.charAt(i);
                char c2 = b.charAt(j);
                if (c1 == c2) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                    sb.append(c1);
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        System.out.println(sb.toString());
        return dp[m][n];
    }

    /**
     * 公共子串
     * @param a
     * @param b
     * @return
     */
    public static int longestCommonSubstring(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        int max = 0;
        int[][] dp = new int[alen + 1][blen + 1];

        for (int i = 1; i <= alen; ++i) {
            for (int j = 1; j <= blen; ++j) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > max)
                        max = dp[i][j];
                } else {
                    dp[i][j] = 0;
                }

            }
        }
        return max;
    }


    /**
     * 最长上升子序列
     * @param arr
     * @return
     */
    public static int lengthOfLis(int[] arr) {
        if (arr.length == 0)
            return 0;

        int[] dp = new int[arr.length];
        int res = 0;
        Arrays.fill(dp, 1);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            res = Math.max(res, dp[i]);
        }

        return res;
    }
}
