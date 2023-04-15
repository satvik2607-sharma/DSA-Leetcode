public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
        int max_sum=nums[0];
        int current_sum=0;

        for (int i = 0; i < nums.length; i++) {
            current_sum+=nums[i];

            if(current_sum>max_sum){
                max_sum=current_sum;
            }
            if(current_sum < 0){
                current_sum=0;
            }
            
    }
    return max_sum;
    }
}
