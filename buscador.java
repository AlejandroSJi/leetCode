public class buscador {
    static public int searchInsert(int[] nums, int target) {
        int j = 0;
        int i;
        for ( i = 0; i < nums.length; i++){
            if (nums[i]>=target)
                return i;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 6, 15};
        int target = 15;
        System.out.println(searchInsert(nums,target));
    }
}
