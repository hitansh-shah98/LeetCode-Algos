class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }
    public void quickSort(int[] arr , int low , int high){
        if(low>=high)
            return;
        int s =low , e=high;
        int mid = high - (high-low)/2;
        int pivot = arr[mid];
        while(s<=e){
            while(arr[s]<pivot)
                s++;
            while(arr[e]>pivot)
                e--;
            if(s<=e)
            {
                int tmp= arr[s];
                arr[s]=arr[e];
                arr[e]=tmp;
                s++;
                e--;
            }
        }
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }
}