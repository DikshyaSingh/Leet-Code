public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start merging from the last element of both arrays.
        int last = m + n - 1;

        // Index pointers for nums1 and nums2
        int i = m - 1; // last element in nums1 (not counting zeros)
        int j = n - 1; // last element in nums2

        // Merge from the end to the start
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[last--] = nums1[i--]; // Take the larger element from nums1
            } else {
                nums1[last--] = nums2[j--]; // Take the larger element from nums2
            }
        }

        // If there are remaining elements in nums2, place them in nums1
        while (j >= 0) {
            nums1[last--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        // Output the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
