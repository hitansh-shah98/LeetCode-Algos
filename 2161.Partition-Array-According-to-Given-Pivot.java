class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] array1 = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                array1[j] = nums[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                array1[j] = nums[i];
                j++;
            }
        }
         for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                array1[j] = nums[i];
                j++;
            }
        }
        return array1;
    }
}

// other soln
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] array1 = new int[nums.length];
        int j=0;
        int left=0;
        int right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                array1[j] = nums[i];
                j++;
            }
            int tmp = nums.length-i-1;
            if(nums[tmp]>pivot){
                array1[right]=nums[tmp];
                right--;
            }
        }
        while(j<=right){
            array1[j]=pivot;
            j++;
        }
       
        return array1;
    }
}