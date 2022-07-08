class Solution {
    public int shipWithinDays(int[] weights, int days) {
       
        int low=0;
         int high=0;
        
        for(int i=0;i<weights.length;i++){
            high+=weights[i];
            low=Math.max(low,weights[i]);
        }
        int ans=0;
        while(low<=high){
           
            int mid = (low+high)/2;
            if(isValid(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
              
        }
        return ans;
    }
    boolean isValid(int[] weights, int days,int mid){
        int d=1;
        int sum=0;
        //System.out.println("mid: "+mid);
        for(int i=0;i<weights.length;i++){
            
            if(sum+weights[i] > mid)
            {
                d++;
                sum=weights[i];
            }
             else{
             sum += weights[i];
            }
        }
        //System.out.println("D: "+d);
        return d<=days;
    }
}