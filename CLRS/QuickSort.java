/**
 * 快速排序
 *
 * @author
 * @create 2018-12-03 16:49
 **/

package CLRS;

import javax.management.timer.Timer;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int testNum = 20;
        for (int i = 0; i < testNum; i++) {
            qSortTest ();
        }

    }


    private static void qSortTest() {
        int[] a = creatRandArr ();
        System.out.print ("before:" + "\t");
        for (int i = 0; i < a.length; i++) {
            System.out.print (a[i] + "," + "\t");
        }
        //sort(a, 0, a.length - 1);
        quickSort (a, 0, a.length - 1);
        System.out.print ("\n" + "after:" + "\t");

        for (int i = 0; i < a.length; i++) {
            System.out.print (a[i] + "," + "\t");
        }
        System.out.println ("\n" + "qSortResult:  " + isSorted (a) + "\n");
    }

    private static void quickSort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int n = partition (a, lo, hi, 3);
            quickSort (a, lo, n - 1);
            quickSort (a, n + 1, hi);
        }
    }

    private static int partition(int[] arr, int lo, int hi, int type) {
        if (type == 0) {
            int i = lo;
            int v = arr[lo];
            for (int j = lo + 1; j <= hi; j++) {
                if (arr[j] <= v) {
                    swap (arr, ++i, j);
                }
            }
            swap (arr, i, lo);
            return i;
        } else if (type == 1) {
            int v = arr[hi];
            while (lo < hi) {
                while (lo < hi && arr[lo] <= v) {
                    lo++;
                }
                arr[hi] = arr[lo];
                while (lo < hi && arr[hi] >= v) {
                    hi--;
                }
                arr[lo] = arr[hi];
            }
            arr[hi] = v;
            return hi;
        } else if (type == 2) {
            int pivot = lo;
            while (lo < hi) {
                while (lo < hi && arr[hi] >= arr[pivot]) {
                    hi--;
                }
                while (lo < hi && arr[lo] <= arr[pivot]) {
                    lo++;
                }
                swap (arr, lo, hi);
            }
            swap (arr, lo, pivot);
            return lo;
        } else {
            System.out.println ("Algo4");
            int v = arr[lo];
            int i = lo, j = hi + 1;
            while (true) {
                while (arr[--j] > v) {
                }
                while (arr[++i] < v) {
                    if (i == hi) {
                        break;
                    }
                }
                if (i >= j) {
                    break;
                }
                swap (arr, i, j);
            }
            swap (arr, lo, j);
            return j;
        }


    }

    /**
     * 3 way quick sort
     *
     * @param arr the array to be sorted
     * @param lo  start index
     * @param hi  end index
     */
    private static void sort(int[] arr, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int lt = lo, i = lo + 1, gt = hi;
        int v = arr[lo];
        while (i <= gt) {
            if (arr[i] < v) {
                swap (arr, lt++, i++);
            } else if (arr[i] > v) {
                swap (arr, i, gt--);
            } else {
                i++;
            }
        }
        sort (arr, lo, lt - 1);
        sort (arr, gt + 1, hi);
    }


    private static void swap(int[] n, int a, int b) {
        int t = n[a];
        n[a] = n[b];
        n[b] = t;
    }

    private static Random r = new Random ();

    private static int[] creatRandArr() {
        int length = 5 + r.nextInt (10);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = r.nextInt (100);
        }
        return arr;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
