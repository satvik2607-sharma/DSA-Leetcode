public class LeetCode1822{
    public static void main(String[] args) {
        int[] nums={41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int ans=arraySign(nums);
        System.out.println(ans);
    }
    public static int arraySign(int[] nums){
        int product=nums[0];
        for(int i=1;i<nums.length-1;i++){
            product*=nums[i];
        }
        return signFunc(product);
    }

    public static int signFunc(int x){
        if(x>0){
            return 1;
        }
        else if(x<0){
            return -1;
        }
        else{
            return 0;
        }
    }
}        