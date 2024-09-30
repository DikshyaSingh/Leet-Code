import java.util.Arrays;
public class medianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Get the sizes of both input arrays.
        int n = nums1.length;
        int m = nums2.length;

        // Merge the arrays into a single sorted array.
        int[] merged = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            merged[k++] = nums2[i];
        }

        // Sort the merged array.
        Arrays.sort(merged);

        // Calculate the total number of elements in the merged array.
        int total = merged.length;

        if (total % 2 == 1) {
            // If the total number of elements is odd, return the middle element as the median.
            return (double) merged[total / 2];
        } else {
            // If the total number of elements is even, calculate the average of the two middle elements as the median.
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }
    public static void main(String[] args) {
        medianOfTwoSortedArray solution = new medianOfTwoSortedArray();

        // Example arrays
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        // Find and print the median of the two sorted arrays
        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median of the two sorted arrays: " + median);

        // Another example
        int[] nums1_2 = {1, 2};
        int[] nums2_2 = {3, 4};
        double median2 = solution.findMedianSortedArrays(nums1_2, nums2_2);
        System.out.println("Median of the two sorted arrays: " + median2);
    }
}
