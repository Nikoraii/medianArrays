import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args)
    {
        int[] nums1 = new int[]{6, 7};
        int[] nums2 = new int[]{5, 8};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result;
        int m = nums1.length;
        int n = nums2.length;
        int[] numsR = new int[m + n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (i < nums1.length) {
                numsR[i] = nums1[i];
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < nums2.length) {
                numsR[count] = nums2[i];
                count++;
            }
        }
        Arrays.sort(numsR);
        int size = numsR.length;
        if (size % 2 == 0) {
            int check = numsR[size / 2 - 1] + numsR[size / 2];
            return (double) check / 2;
        } else {
            return (double) numsR[size / 2];
        }
    }
}