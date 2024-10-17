public class maximumSwap {
    public int MaximumSwap(int num) {
        char[] numArr = Integer.toString(num).toCharArray();
        int n = numArr.length;

        // Track the last occurrence of each digit (0-9)
        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[numArr[i] - '0'] = i;
        }

        // Traverse the number from left to right
        for (int i = 0; i < n; i++) {
            // Check if we can find a larger digit to swap
            for (int d = 9; d > numArr[i] - '0'; d--) {
                if (last[d] > i) {
                    // Swap and return the new number
                    char temp = numArr[i];
                    numArr[i] = numArr[last[d]];
                    numArr[last[d]] = temp;
                    return Integer.parseInt(new String(numArr));
                }
            }
        }

        // Return the original number if no swap occurred
        return num;
    }

    // Main method to test maximumSwap
    public static void main(String[] args) {
        maximumSwap sol = new maximumSwap();

        int testNum = 2736;
        System.out.println("After swapping, maximum number: " + sol.MaximumSwap(testNum)); // Expected output: 7236

        testNum = 9973;
        System.out.println("After swapping, maximum number: " + sol.MaximumSwap(testNum)); // Expected output: 9973
    }
}
