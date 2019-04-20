package _2018秋招笔试题.DiDi;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定入栈次序，求所有可能出栈次序
 *
 * @version 1.0
 * @created by bill
 * @on 2018-10-12 上午10:57
 **/
public class StackOutOrder {
    static int[] in = {1, 2, 3, 4};

    public static void main(String[] args) {
//        String s = "4132";
        String s = "1432";
        fun (0, new Stack<Integer> (), "");
        if (res.contains (s)) {
            System.out.println ("Yes");
        } else {
            System.out.println ("No");
        }

    }

    static List<String> res = new ArrayList<> ();

    static void fun(int n, Stack<Integer> stk, String sout) {
        if (n == in.length && stk.isEmpty ()) {//如果入栈完毕了，且也栈空了，就输出此出栈顺序          这个是递归的结束条件
            res.add (sout);
//            System.out.println (sout);
        } else//以上其中一项未完成
        {
            Stack<Integer> s1 = (Stack<Integer>) stk.clone ();
            Stack<Integer> s2 = (Stack<Integer>) stk.clone ();
            //选择入栈
            if (n < in.length)//如果是未全部入栈
            {
                s1.push (in[n]);//      继续入栈
                fun (n + 1, s1, sout + "");//执行下一个操作
            }
            //选择出栈
            if (!s2.isEmpty ())//如果栈不空，并且，入栈元素不是最后一个
            {                                   //当到最后一个字符入栈之后，上面已经执行先出栈了
                String temp = sout + s2.peek ();//记录出栈元素
                s2.pop ();//出栈
                fun (n, s2, temp);
            }
        }
    }
}
