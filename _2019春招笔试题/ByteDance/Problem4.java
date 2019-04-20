package 字节跳动19春招第二次在线测评;

import java.util.Scanner;

public class Problem4 {
    /**
     * 给定一组城市和没对城市之间距离。
     * 找到每个城市到达一次并返回到起点的最小距离
     * 输入
     * 4
     * 0 2 6 5
     * 2 0 4 4
     * 6 4 0 2
     * 5 4 2 0
     * 输出
     * 13
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[j][i] = sc.nextInt();
            }
        }

    }
}
