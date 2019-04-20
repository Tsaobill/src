/**
 * @author
 * @create 2019-04-23 20:17
 **/

package _2019春招笔试题.MeiTuan;

import java.util.Scanner;

/**
 * 我们称一个矩阵为黑白矩阵，当且仅当对于该矩阵中每一个位置如(i,j),其上下左右四个方向的数字相等，
 * 即(i-1,j),(i+1,j),(i,j+1),(i,j-1)四个位置上的数字两两相等且均不等于(i,j)位置上的数字。(超出边界的格子忽略)
 * 现在给出一个n*m的矩阵，我们想通过修改其中的某些数字，使得该矩阵成为黑白矩阵，问最少修改多少个数字。
 * 输入
 * 第一行包含两个整数n,m,表示矩阵的长宽。(1≤n,m≤100000,1≤n*m≤100000)。
 * 接下来有n行，每行包含m个整数，中间用空格隔开，表示n*m的矩阵。
 * 输出
 * 输出仅包含一个数字，表示该矩阵想修改为黑白矩阵最少修改的数字数量。
 * 样例输入
 * 3 3
 * 1 1 1
 * 1 1 1
 * 1 1 1
 * 样例输出
 * 4
 * 提示
 * 补充样例
 * 输入样例2
 * 3 3
 * 1 1 1
 * 1 5 1
 * 1 1 1
 * 输出样例2
 * 4
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][m] = sc.nextInt();
            }
        }

    }

    private static boolean judge(int[][] mat, int i, int j) {
        if (i > 0 && i < mat.length - 1 && j > 0 && j < mat[0].length) {
            boolean condi1 = (mat[i - 1][j] == mat[i][j - 1] && mat[i][j + 1] == mat[i + 1][j] && mat[i + 1][j] != mat[i][j] && mat[i - 1][j] != mat[i][j]);
            boolean condi2 = (mat[i - 1][j] == mat[i + 1][j] && mat[i][j + 1] == mat[i][j - 1] && mat[i][j - 1] != mat[i][j] && mat[i - 1][j] != mat[i][j]);
            boolean condi3 = (mat[i - 1][j] == mat[i][j + 1] && mat[i][j - 1] == mat[i + 1][j] && mat[i + 1][j] != mat[i][j] && mat[i - 1][j] != mat[i][j]);
            return condi1 || condi2 || condi3;
        } else if (i == 0) {

        }
        return false;
    }
}
