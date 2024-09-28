public class removeDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int a = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,2};
        int length = removeDuplicates(nums);
        System.out.println(length);
    }
}
