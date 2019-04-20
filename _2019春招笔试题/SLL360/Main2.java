/**
 * @author
 * @create 2019-04-24 19:17
 **/

package _2019春招笔试题.SLL360;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main2 {


    /**
     * 小明家有一些彩球，一段时间后小明玩耍时将它们无序的散落在家中，一天，小明想对其进行整理，
     * 规则为一个篮子中只放一种颜色彩球，可有多个篮子放同一颜色的球，每个篮子里的球不少于2个。
     * 假设小明整理好后，能使各篮子中彩球数量是相同的，则认为小明整理好了。
     * 用一个数字表示一种颜色彩球，一组数表示小明已经找到了的彩球，问小明用找到的全部彩球能按规则整理好么？
     * <p>
     * 输入
     * 第一行彩球总数: n,  2<n<10000
     * 第二行一段整数ai,  1<ai<10000  (排除ai全部相等的情况)
     * <p>
     * 输出
     * 若能整理好，最小篮子数；否则0
     * <p>
     * 样例输入
     * 6
     * 1 1 2 2 2 2
     * 样例输出
     * 3
     * <p>
     * 提示
     * 样例输入:
     * 6
     * 1 1 2 2 2 2
     * 样例输出:
     * 3      	tip: [1, 1] [2, 2] [2, 2]
     * 样例输入:
     * 5
     * 1 1 1 2 2
     * 样例输出:
     * 0     		tip: [1 1 1] [2 2]
     * <p>
     * 样例输入:
     * 6
     * 1 1 1 2 2 2
     * 样例输出:
     * 2      	tip: [1 1 1] [2 2 2]
     * <p>
     * 请完成下面这个函数，实现题目要求的功能
     * 当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
     * *****************************开始写代码
     ******************************/
    static int main(Scanner in) {
        int n = in.nextInt();
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (map.containsKey(num)) {
                map.replace(num, map.get(num), map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int[] arr = new int[map.size()];
        int i = 0;
        int min = Integer.MAX_VALUE;
        for (Integer key : map.keySet()) {
            arr[i] = map.get(key);
            min = min > arr[i] ? arr[i] : min;
            i++;
        }
        if (min <= 1) {
            return 0;
        }
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            int mod = arr[j] % min;
            if (mod != 0) {
                return 0;
            }
            count += arr[j] / min;
        }

        return count;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        res = main(in);
        System.out.println(String.valueOf(res));

    }
}
