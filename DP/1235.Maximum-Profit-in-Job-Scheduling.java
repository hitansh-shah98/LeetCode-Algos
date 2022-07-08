class Solution {
    private class Job{
        int start,end,profit;
        private Job(int start,int end , int profit){
            this.start = start;
            this. end  = end;
            this.profit = profit;
        }
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        Job [] jobs = new Job [startTime.length];
        for(int i=0;i<jobs.length;i++){
            jobs[i]= new Job(startTime[i],endTime[i],profit[i]);
            
        }
        Arrays.sort(jobs,(a,b)->a.end-b.end);
    
        int dp [] = new int[jobs.length];
        dp[0]=jobs[0].profit;
        for(int i=1;i<jobs.length;i++){
            int inc=jobs[i].profit;
            int low=0;
            int high=i-1;
            int last=-1;
            while(low<=high){
                int mid = (low+high)/2;
                 //System.out.println(i + ": " + "mid: " + mid);
                if(jobs[mid].end <= jobs[i].start){
                    last = mid;
                    low=mid+1;
                }
                else
                    high=mid-1;
            }
             //System.out.println(i + ": " + "last: " + last);
            if(last!=-1) inc+=dp[last];
             //System.out.println(i + ": " + "INC: " + inc);
            int exc=dp[i-1];
            //System.out.println(i + ": " + "exc: " + exc);
            dp[i]=Math.max(inc,exc);
            //System.out.println(i + ": " + "dp[i]: " + dp[i]);
        }
        return dp[jobs.length-1];
    }
    
}