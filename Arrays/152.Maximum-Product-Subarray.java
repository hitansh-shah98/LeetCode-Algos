class Solution {
    public int maxProduct(int[] nums) {
           int sum=1;
        int max=Integer.MIN_VALUE;
        if(nums.length==1)
            return nums[0];
        for(int i=0;i<nums.length;i++){
            sum*=nums[i];
            max=Math.max(max,sum);
            if(sum==0)
                sum=1;
            
        
                
        }
        sum=1;
        int max2=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            sum*=nums[i];
            max2=Math.max(max2,sum);
            if(sum==0)
                sum=1;
            
        
                
        }
        return max>max2 ? max:max2;
    }
}