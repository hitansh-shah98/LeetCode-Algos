class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            max=Math.max(max,sum);
           
            //System.out.println("min: "+ min + " max: "+max);
            if(sum<0)
                sum=0;
            
        
                
        }
        sum=0;
         for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            min=Math.min(min,sum);
           
            //System.out.println("min: "+ min + " max: "+max);
            if(sum>0)
                sum=0;
            
        
                
        }
        return Math.max(max,Math.abs(min)); 
    }
}