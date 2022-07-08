// As the array is inclusive of [1,n] , we can apply cyclic sort
// In the end , the element which is not in its correct position will be present in the last index

class Solution {
    public int findDuplicate(int[] nums) {
         int k=0;
        while(k<nums.length){
            int correct = nums[k]-1;
            if(nums[k]!=nums[correct])
            {
                int temp=nums[k];
                nums[k]=nums[correct];
                nums[correct]=temp;
            }
            else
                k++;
                
        }
      
            return nums[nums.length-1];
     
      
        
    }
     
}