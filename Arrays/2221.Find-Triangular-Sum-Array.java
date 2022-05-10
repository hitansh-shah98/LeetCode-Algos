class Solution {
    public int triangularSum(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=nums.length-1;j>i;j--){
                nums[j]=(nums[j]+nums[j-1])%10;
            }
        }
        return nums[nums.length-1];
    }
}