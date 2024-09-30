import java.util.HashMap;
import java.util.Map;

public class climbingStairs {
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairs(n, memo);
    }

    private int climbStairs(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
        }
        return memo.get(n);
    }
    public static void main(String[] args) {
        climbingStairs cs = new climbingStairs();
        int n = 5; // Example input
        int result = cs.climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + result);
    }
}
