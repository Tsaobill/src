/**
 * @author
 * @create 2019-04-24 19:17
 **/

package _2019春招笔试题.SLL360;

import java.util.Scanner;

public class Main1 {
    /**
     * 将一个字符串转换成一个整数，数值为0或者是字符串等不是一个合法的数值则返回0，小数直接取整数部分。
     * 要求：不能使用字符串转换整数的库函数
     * <p>
     * 请完成下面这个函数，实现题目要求的功能
     * 当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
     * *****************************开始写代码
     ******************************/
    static int string2int(String str) {
        int maxDiv10 = Integer.MAX_VALUE / 10;

        int i = 0, n = str.length();
        while (i < n && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        int sign = 1;
        if (i < n && str.charAt(i) == '+') {
            i++;
        } else if (i < n && str.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        int num = 0;
        while (i < n && Character.isDigit(str.charAt(i))) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (num > maxDiv10 || num == maxDiv10 && digit >= 8) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;
        }
        if (i < n && str.charAt(i) != '.') {
            return 0;
        }
        return sign * num;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int res;

            String _str;
            try {
                _str = in.nextLine();
            } catch (Exception e) {
                _str = null;
            }
            res = string2int(_str);
            System.out.println(String.valueOf(res));
        }

    }
}
