package CLRS;

/**
 * 基于堆结构的 优先队列
 *
 * @version 1.0
 * @created by bill
 * @on 2018-09-27 下午3:00
 **/
public class PriorityQueue {
    public static void main(String[] args) {
        int a[] = new int[]{16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        HeapSort.BUILD_MAX_HEAP (a);
        System.out.println (HEAP_MAXIMUM (a));
     //   System.out.println (HEAP_EXTRACT_MAX (a));
        HEAP_INCREASE_KEY (a,8,15);
        for (int n:a
             ) {
            System.out.print (n+" ");
        }
    }

    public static int HEAP_MAXIMUM(int[] a) {
        return a[0];
    }

    public static int HEAP_EXTRACT_MAX(int[] a) {
      int max=a[0];
      a[0]=a[a.length-1];
      HeapSort.MAX_HEAPIFY_WHILE (a,0,a.length-1);
      return max;
    }

    public static void HEAP_INCREASE_KEY(int[] a, int i, int key) {
        a[i]=key;
        while (i > 0 && a[i] > a[HeapSort.PARENT (i)]) {
            HeapSort.exchange (a,i,HeapSort.PARENT (i));
            i = HeapSort.PARENT (i);
        }
    }

    public static void MAX_HEAP_INSERT(int[] a, int key) {

    }


}
