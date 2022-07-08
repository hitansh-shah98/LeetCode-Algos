class Solution {
    private class Ride{
        int start,end,tip,earn;
        private Ride(int start,int end , int tip){
            this.start = start;
            this. end  = end;
            this.tip = tip;
            this.earn= end-start+tip;
        }
    }
    public long maxTaxiEarnings(int n, int[][] rides) {
        Ride [] r = new Ride[rides.length];
        for(int i=0;i<rides.length;i++){
            r[i] = new Ride(rides[i][0],rides[i][1],rides[i][2]);
            
        }
        Arrays.sort(r,(a,b)->a.end-b.end);
        long dp [] = new long[r.length];
        dp[0]=r[0].earn;
        for(int i=1;i<r.length;i++){
            long inc=r[i].earn;
            int low=0;
            int high=i-1;
            int last=-1;
            while(low<=high){
                int mid = (low+high)/2;
                
                if(r[mid].end <= r[i].start){
                    last = mid;
                    low=mid+1;
                }
                else
                    high=mid-1;
            }
         
            if(last!=-1) inc+=dp[last];
         
            long exc=dp[i-1];
          
            dp[i]=Math.max(inc,exc);
         
        }
        return dp[r.length-1];
      
    }
}