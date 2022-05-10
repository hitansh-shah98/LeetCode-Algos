class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length + nums2.length;
        double []nums3 = new double[n];
        int j=0;
        for(int i=0 ;i<nums1.length;i++){
            nums3[j]=nums1[i];
            j++;
        }
        for(int i=0 ;i<nums2.length;i++){
            nums3[j]=nums2[i];
            j++;
        }
        Arrays.sort(nums3);
        if(n%2==0){
            //System.out.println("1: " +nums3[ n/2] +" 2: " + nums3[ (n-1)/2]);
          
            return (nums3[ n/2] + nums3[(n-1)/2])/2;
        }
        else
            return nums3[n/2];
    }
}