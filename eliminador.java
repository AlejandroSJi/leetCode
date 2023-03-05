public class eliminador {
    static int removeElement(int[] nums, int val, int n){
        int j = 0;
        for (int i = 0; i < n - 1 ; i++){
            if(nums[i]!=val)
                nums[j++] = nums[i];
        }
        if (nums[n-1] != val)
            nums[j++]=nums[n-1];
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2,1};
        int val = 2;
        int n = nums.length;

        n = removeElement(nums,val,n);

        for (int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
