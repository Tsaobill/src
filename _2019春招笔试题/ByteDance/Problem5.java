package 字节跳动19春招第二次在线测评;

import java.util.Arrays;
import java.util.Scanner;

//字节跳动 19春招第二次在线测评
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int[] time = new int[num];

            for (int j = 0; j < num; j++) {
                time[j] = sc.nextInt();
            }
            Arrays.sort(time);
            int sum = time[time.length - 1];
            for (int j = time.length - 2; j > 1; j--) {
                sum += 2 * time[j];
            }
            System.out.println(sum);

        }
    }
}
