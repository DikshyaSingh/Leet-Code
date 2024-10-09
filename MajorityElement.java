import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();

        // Test case 1
        int[] input1 = {3, 2, 3};
        System.out.println("Majority element in input1: " + solution.majorityElement(input1));

        // Test case 2
        int[] input2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element in input2: " + solution.majorityElement(input2));

        // Test case 3
        int[] input3 = {1};
        System.out.println("Majority element in input3: " + solution.majorityElement(input3));

        // Test case 4
        int[] input4 = {6, 6, 6, 7, 7};
        System.out.println("Majority element in input4: " + solution.majorityElement(input4));
    }
}
