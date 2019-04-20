/**
 * 单词排序
 *
 * @author
 * @create 2019-04-02 9:48
 **/

package _2019春招笔试题.Baidu;


import javafx.collections.ArrayChangeListener;

import java.util.ArrayList;

/**
 * 判断一个字符串数组能够以 单词的首字母和前一个单词的尾字母相同；第一个的首和最后一个单词尾不作要求
 * 输入：
 * 一个字符串数组
 * 输出：
 * 不能 返回 -1
 * 能 返回 1
 * <p>
 * 考虑回溯法
 */
public class WordListOrder {
    public static void main(String[] args) {
        int[] arr = new int[]{-5, -6, 10, 10, -10,1};

    }



    private static int canArrangeWords(String[] arr) {
        int arrLen = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].charAt(arr[i].length() - 1) == arr[i + 1].charAt(0)) {

            }
        }
        return -1;
    }

    private static int can(String[] arr, int pivot) {
        if (pivot > 0) {
            for (int i = 0; i < pivot; i++) {

            }
        }

        if (pivot < arr.length - 1) {
            for (int i = pivot + 1; i < arr.length; i++) {

            }
        }
        return 0;
    }


}
