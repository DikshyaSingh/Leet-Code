public class removeElement {
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int a = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        int length = removeElement(nums,3);
        System.out.println(length);
    }
}
