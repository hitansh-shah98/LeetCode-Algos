// ** IMPORTANT
class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        if(nums.length ==1) return;
        for(int i=nums.length-1 ; i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                idx = i;
                break;
            }
            
        }
        if(idx == -1){
            Arrays.sort(nums);
            return;
        }
        int num = nums[idx-1];
        int idx1 = idx-1;
      
      
        int idx2 = 0;
        for(int i = idx ; i <= nums.length-1;i++){
            if(nums[i] > num ){
                
                idx2 = i;
                              
            }
                
        }
        nums = swap(nums,idx1,idx2);
       
        Arrays.sort(nums,idx,nums.length);
             
           
           
        
    }
    int [] swap (int [] a ,int i ,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j] = temp;
        return a;
    }
}