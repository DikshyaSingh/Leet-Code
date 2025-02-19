class sqrt {
    public int mySqrt(int x) {
        // For special cases when x is 0 or 1, return x.
        if (x == 0 || x == 1)
            return x;

        // Initialize the search range for the square root.
        int start = 1;
        int end = x;
        int mid = -1;

        // Perform binary search to find the square root of x.
        while (start <= end) {
            // Calculate the middle point using "start + (end - start) / 2" to avoid integer overflow.
            mid = start + (end - start) / 2;

            // If the square of the middle value is greater than x, move the "end" to the left (mid - 1).
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                // If the square of the middle value is equal to x, we found the square root.
                return mid;
            else
                // If the square of the middle value is less than x, move the "start" to the right (mid + 1).
                start = mid + 1;
        }
        // The loop ends when "start" becomes greater than "end", and "end" is the integer value of the square root.
        // However, since we might have been using integer division in the calculations,
        // we round down the value of "end" to the nearest integer to get the correct square root.
        return Math.round(end);
    }
    public static void main(String[] args) {
        sqrt solver = new sqrt();

        // Test cases
        int test1 = 4;
        int test2 = 8;
        int test3 = 16;
        int test4 = 25;
        int test5 = 0;
        int test6 = 1;
        // Printing the results for the test cases
        System.out.println("Square root of " + test1 + " is: " + solver.mySqrt(test1)); // Expected: 2
        System.out.println("Square root of " + test2 + " is: " + solver.mySqrt(test2)); // Expected: 2
        System.out.println("Square root of " + test3 + " is: " + solver.mySqrt(test3)); // Expected: 4
        System.out.println("Square root of " + test4 + " is: " + solver.mySqrt(test4)); // Expected: 5
        System.out.println("Square root of " + test5 + " is: " + solver.mySqrt(test5)); // Expected: 0
        System.out.println("Square root of " + test6 + " is: " + solver.mySqrt(test6)); // Expected: 1
    }
}
