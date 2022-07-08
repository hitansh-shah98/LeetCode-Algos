class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=m-1;
        int i=n-1;
        int end =m+n-1;
        while(j>=0 && i>=0){
            nums1[end--] = nums1[j]>nums2[i]? nums1[j--]:nums2[i--];
          
        }
        while(i>=0){
              nums1[end--]=nums2[i--];

        }
            
      
    }
    
}