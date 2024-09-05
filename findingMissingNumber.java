import java.util.Arrays;

public class findingMissingNumber {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int totalRolls = n + m;
        int totalSumRequired = mean * totalRolls;
        int sumOfGivenRolls = 0;
        for (int roll : rolls) {
            sumOfGivenRolls += roll;
        }
        int sumOfMissingRolls = totalSumRequired - sumOfGivenRolls;

        // Check if the sum of missing rolls is within the valid range
        if (sumOfMissingRolls < n || sumOfMissingRolls > 6 * n) {
            return new int[0]; // Return empty array if impossible
        }

        // Construct the result array
        int[] result = new int[n];
        Arrays.fill(result, 1); // Start with all minimum values
        int sumRemaining = sumOfMissingRolls - n; // Remaining sum to distribute

        for (int i = 0; i < n; i++) {
            if (sumRemaining > 0) {
                // Maximum we can add to the current position is 5 (since it starts from 1)
                int add = Math.min(5, sumRemaining);
                result[i] += add;
                sumRemaining -= add;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        findingMissingNumber s = new findingMissingNumber();
        
        // Example 1
        int[] rolls1 = {3, 2, 4, 3};
        int mean1 = 4;
        int n1 = 2;
        System.out.println(Arrays.toString(s.missingRolls(rolls1, mean1, n1))); // Output: [6, 6]
        
        // // Example 2
        // int[] rolls2 = {1, 5, 6};
        // int mean2 = 3;
        // int n2 = 4;
        // System.out.println(Arrays.toString(mr.missingRolls(rolls2, mean2, n2))); // Output: [2, 3, 2, 2]
        
        // // Example 3
        // int[] rolls3 = {1, 2, 3, 4};
        // int mean3 = 6;
        // int n3 = 4;
        // System.out.println(Arrays.toString(mr.missingRolls(rolls3, mean3, n3))); // Output: []
    }
}
