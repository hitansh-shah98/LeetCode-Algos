class Solution
{
	public static int kthSmallest(int[][]arr,int n,int k)
	{
      PriorityQueue<Integer> pq= new PriorityQueue<Integer> (Comparator.reverseOrder()); // for kth smallest element
	  // PriorityQueue<Integer> pq= new PriorityQueue<Integer> (); // for kth largest element
   
   for(int i = 0; i< n; i++){
       for(int j = 0; j< n; j++){
           pq.add(arr[i][j]);
            if(pq.size() > k ){
                pq.poll();
            }
    
           
       }
    }

   return pq.poll();
}
}