package CLRS;

/**
 * 堆排序
 *
 * @version 1.0
 * @created by bill
 * @on 2018-09-27 上午9:16
 **/
public class HeapSort {
    public static void main(String[] args) {
        int a[] = new int[]{16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        MAX_HEAPIFY_WHILE (a, 1, a.length);
        for (int item : a) {
            System.out.print (item + ",");
        }
        System.out.println ();
        HEAP_SORT (a);
        System.out.println ("======HeapSort :");
        for (int item : a) {
            System.out.print (item + ",");
        }
    }


    ///最大堆 化
    public static int[] MAX_HEAPIFY_WHILE(int[] a, int i, int heapsize) {
        int max;
        while (i < heapsize - 1) {
            int l = LEFT (i);
            int r = RIGHT (i);
            max = i;
            if (l < heapsize && a[l] > a[max]) {
                max = l;
            }
            if (r < heapsize && a[r] > a[max]) {
                max = r;
            }
            if (max != i) {
                exchange (a, i, max);
                i = max;
            } else {
                return a;
            }
        }
        return a;
    }

    //堆排序
    public static void HEAP_SORT(int[] a) {
        BUILD_MAX_HEAP (a);
        int heapSize = a.length;
        for (int i = a.length - 1; i >= 1; i--) {
            exchange (a, 0, i);
            MAX_HEAPIFY_WHILE (a, 0, --heapSize);
        }
    }

    ///构建最大堆 时间复杂度 大O(n)线性复杂度
    public static void BUILD_MAX_HEAP(int[] a) {
        int l = a.length;
        for (int i = l / 2; i > 0; i--) {
            MAX_HEAPIFY_WHILE (a, i, a.length);
        }
    }

    ///交换两个元素位置
    public static void exchange(int[] a, int i, int max) {
        int temp = a[max];
        a[max] = a[i];
        a[i] = temp;
    }

    public static int LEFT(int i) {
        return 2 * i + 1;
    }

    public static int RIGHT(int i) {
        return 2 * i + 2;
    }

    public static int PARENT(int i) {
        return (i - 1) / 2;
    }
}
