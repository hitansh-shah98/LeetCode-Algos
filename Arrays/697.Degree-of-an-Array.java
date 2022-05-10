class Solution {
    public int findShortestSubArray(int[] nums) {
        if(nums.length==1)
            return 1;
       HashMap<Integer,Integer>mp=new HashMap<>();
       int max = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++)
    {
        if(mp.containsKey(nums[i])){
            mp.put(nums[i],mp.get(nums[i])+1);
          
        }
        else
            mp.put(nums[i],1);
        
        max=Math.max(max,mp.get(nums[i])); 
    }
    ArrayList<Integer> al = new ArrayList<Integer>();
       for (Map.Entry<Integer,Integer> mapElement : mp.entrySet()) {
           int val=mapElement.getValue();
           if(val ==max)
               al.add(mapElement.getKey());
               
       }
     int min = Integer.MAX_VALUE;   
    for(Integer i: al){
        int j=0;
        while(j<nums.length && nums[j]!=i)
            j++;
        int k=nums.length-1;
        while(k>=0 && nums[k]!=i)
            k--;
        
        min=Math.min(min,k-j);
    }
        return min+1;
    }}