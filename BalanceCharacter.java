
import java.util.ArrayList;
import java.util.List;

/**栈的应用之
 * 编译器平衡符号的简单实现
 *
 * @version 1.0
 * @created by bill
 * @on 2018-10-16 下午2:11
 **/
public class BalanceCharacter {
    public static void main(String[] args) {
        matchChar ("{}{(}[])(String(){[]} str)");
    }

    public static void matchChar(String str) {
        FundmentalDataStructure.Stack<Character> stack = new FundmentalDataStructure.Stack (str.length ());
        List<Character> listOpen = new ArrayList<> ();
        List<Character> listClose = new ArrayList<> ();
        listOpen.add ('{');
        listClose.add ('}');
        listOpen.add ('(');
        listClose.add (')');
        listOpen.add ('[');
        listClose.add (']');

        for (int i = 0; i < str.length (); i++) {
            char c = str.charAt (i);
            if (listOpen.contains (c)) {
                stack.push (c);
            } else if (listClose.contains (c)) {
                if (stack.isEmpty ()) {
                    System.out.println ("错误 " + i);
                    return;
                } else {
                    char prev = stack.pop ();
                    if (!isMate (prev, c)) {
                        System.out.printf ("错误" + i);
                        return;
                    }
                }
            }
        }
        if (!stack.isEmpty ()) {
            System.out.println ("错误" + stack.pop ());
            return;
        }
        System.out.println ("编译通过");
    }

    public static boolean isMate(char a, char b) {
        if (a == '{' && b == '}') return true;
        if (a == '(' && b == ')') return true;
        if (a == '[' && b == ']') return true;
        return false;
    }
}
