import java.util.PriorityQueue;

public class MaximalScoreAfterApplyingKOperations {
    public static long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> maxHeap = new PriorityQueue<>((a, b) -> Long.compare(b, a));

        // Insert all elements into the max-heap
        for (int num : nums) {
            maxHeap.add((long) num);
        }

        long score = 0;
        for (int i = 0; i < k; i++) {
            long maxVal = maxHeap.poll();

            // Add the largest value to the score
            score += maxVal;

            // Replace the number with ceil(maxVal / 3)
            maxHeap.add((maxVal + 2) / 3);  // Using (maxVal + 2) / 3 to simulate ceil
        }

        return score;
    }
    public static void main(String[] args) {
        int[] nums = {10, 20, 7};
        int k = 4;

        long result = maxKelements(nums, k);
        System.out.println("Maximal score after " + k + " operations: " + result);
    }
}
