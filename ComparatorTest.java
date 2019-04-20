import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @version 1.0
 * @created by bill
 * @on 2019-04-16 15:58
 **/
public class ComparatorTest {

    public static void main(String[] args) {
        Comparator com = new MyComp ();
        String[] str= new String[]{"Tom","Jerry","Lily"};
        Arrays.sort (str,com);
        for (int i = 0; i < str.length; i++) {
            System.out.println (str[i]);
        }
    }
}
class MyComp implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length ()-o2.length ();
    }
}
