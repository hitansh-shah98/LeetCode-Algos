class Solution {
    public void wiggleSort(int[] nums) {
     int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        int j = nums.length - 1;
        
       
        for (int i = 1; i < nums.length; i += 2) nums[i] = copy[j--];
        for (int i = 0; i < nums.length; i += 2) nums[i] = copy[j--]; 
        
    }
}