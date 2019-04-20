/**
 * @author
 * @create 2019-04-02 22:12
 **/

package _2019春招笔试题.Baidu;


/**
 * 求上班路上最小停下来加油的次数
 * 输入：
 *   int num 为加油站数目
 *   int[] distGS 为每个加油站离家的距离（注意是离起点的距离不是两个加油站之间的间隔）
 *   int[] allowedGasoline 为每个加油站最多可加的油量
 *   int distance 为家到办公室之间的距离
 *   int initialGasoline为汽车初始油量
 * <p>
 * 输出：
 * 如果不能到达输出 -1 ；否则输出最小次数
 */
class MinimumStop {

    public static void main(String[] args) {
        int num = 5;
        int[] distGS = new int[]{5,8,9,13,15};
        int[] allowedGas = new int[]{5,3,4,1,3};
        int distance = 18;
        int initialGas = 6;
        System.out.println(Solution(num, distGS, allowedGas, distance, initialGas));

    }

    /**
     * 求上班路上最小停下来加油的次数
     *
     * @param num int num 为加油站数目
     * @param distGS int[] distGS 为每个加油站离家的距离（注意是离起点的距离不是两个加油站之间的间隔）
     * @param allowedGS int[] allowedGasoline 为每个加油站最多可加的油量
     * @param distance int distance 为家到办公室之间的距离
     * @param initialGas int initialGasoline 为汽车初始油量
     * <p>
     * @return 如果不能到达输出 -1 ；否则输出最小次数
     *
     * 下面解法错误 应考虑动态规划或者回溯法
     *
     */
    public static int Solution(int num, int[] distGS, int[] allowedGS, int distance, int initialGas) {
        initialGas -= distGS[0];
        if (initialGas < 0) {
            return -1;
        }
        int[] interval = new int[num];
        for (int i = 0; i < num - 1; i++) {
            interval[i] = distGS[i + 1] - distGS[i];
        }
        int count = 0;
        interval[num - 1] = distance - distGS[num - 1];
        for (int i = 0; i < num; i++) {
            if (initialGas + allowedGS[i] < interval[i]) {
                return -1;
            } else if (initialGas < interval[i]) {
                initialGas += allowedGS[i];
                count++;
            }
            initialGas -= interval[i];
        }
        return count;
    }
}
