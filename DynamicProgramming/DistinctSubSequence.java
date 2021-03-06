package DynamicProgramming;
/**
 * 子序列出现的次数
 *
 * @version 1.0
 * @created by bill
 * @on 2018-10-31 下午10:23
 **/
public class DistinctSubSequence {

    public static void main(String[] args) {
        System.out.println (solve ("rabbbit","rabbit"));
    }
    public static int solve(String s, String t) {
        int ns = s.length ();
        int nt = t.length ();

        //dp[i][j]表示0~i-1的s子串中包含0~j-1的t的个数
        int[][] dp = new int[ns + 1][nt + 1];

        if (nt == 0) {
            return 1;
        }

        for (int i = 0; i <= ns; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <=nt; i++) {
            dp[0][i]=0;
        }
        char ss,tt;
        for (int i = 1; i <= ns; i++) {
            for (int j = 1; j <= nt; j++) {
                dp[i][j] = dp[i - 1][j];//相当于s在i位置的元素不拿
                ss=s.charAt (i-1);tt=t.charAt (j-1);
                if (ss==tt) {//相当于s在i位置的元素拿,且他与t对应位相同
                    dp[i][j] += dp[i - 1][j - 1];
                }
            }
        }

        return dp[ns][nt];
    }
}
