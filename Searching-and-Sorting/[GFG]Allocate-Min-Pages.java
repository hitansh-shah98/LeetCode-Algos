class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        Arrays.sort(A);
        int start=A[N-1];
        int end=0;
        int res=-1;
        for (int i=0;i<N;i++){
            end+=A[i];
        }
        while(start<=end){
            int mid = (start+end)/2;
            if(isValid(A,N,M,mid)==true)
            {
                res=mid;
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return res;
    }
    static boolean isValid(int [] arr, int n , int m , int mid){
        int student =1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>mid){
                student++;
                sum=arr[i];
            }
             if(student > m)
                return false;
        }
       
          return true;
    }
}