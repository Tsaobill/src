/**
 * @author
 * @create 2019-03-16 23:41
 **/

package ProblemSolving;

class KthLargestElement {

    public static void main(String[] args) {
        int n = new KthLargestElement ().findKthLargest(new int[]{1}, 1);
        System.out.println(n);

    }
    public int findKthLargest(int[] nums, int k) {
        if (k < 1 || nums == null) {
            return 0;
        }
        return KthLargestElement.getKth(k, nums, 0, nums.length - 1);
    }

    public static int getKth(int k, int[] nums, int start, int end) {
        int pivot = nums[start];
        int left = start;
        int right = end;
        while (true) {
            while (nums[left] >= pivot && left < right) {
                left++;
            }
            while (nums[right] < pivot && left < right) {
                right--;
            }
            if (left == right) {
                break;
            }
            KthLargestElement.swap(nums, left, right);
        }
        KthLargestElement.swap(nums, right - 1, start);
        if (k == right) {
            return pivot;
        } else if (k < right) {
            return KthLargestElement.getKth(k, nums, start, right - 1);
        } else {
            return KthLargestElement.getKth(k, nums, right, end);
        }
    }

    public static void swap(int[] nums, int n1, int n2) {
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }
}