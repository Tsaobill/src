/**
 * @author
 * @create 2019-04-23 20:18
 **/

package _2019春招笔试题.MeiTuan;

import java.util.Scanner;

/**
 * 给你一棵含有n个结点的树,编号为0…n-1，这n个结点都被染成了黑色或白色，
 * 显然，对于一棵树而言，我们每去掉一条边，就能把树分成两部分。
 * 现在要求你把这棵树切开，使得每一个连通块内只有一个白色结点，
 * 问共有多少种切开的方式满足以上条件?
 * 如果被删除的边集不同，我们则认为两种方式不同，反之认为相同。
 * 请输出方案数对1000000007取模的结果。
 * <p>
 * 参考输入：
 * <p>
 * 10
 * 0 0 1 2 0 5 1 2 3
 * 1 0 0 1 0 0 1 1 0 1
 * 输出3
 * <p>
 * 输入
 * 输入第一行仅包含一个正整数n，表示树包含的结点数量。（1<=n<=100000）
 * <p>
 * 输入第二行包含n-1个数字，第i个数字表示第i个结点的根，我们认为0号结点是整棵树的根，第i个数字不超过i，即第i个结点的根一定是编号小于i的结点。
 * <p>
 * 输入第三行包含n个数字，第i个数字表是第i-1个结点的颜色，仅由0和1组成，0表示第 i-1号节点的颜色是白色，1表示颜色为黑色。
 * <p>
 * 输出
 * 输出仅包含一个整数，即答案对1000000007取模的结果。
 * <p>
 * <p>
 * 样例输入
 * 3
 * 0 0
 * 1 0 0
 * 样例输出
 * 2
 */
public class Mian2 {



}
