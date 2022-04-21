class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<Character>();
      
        int max=0;
        if(s==null)
            return 0;
        int start=0,end=0;
        while(start<s.length() && end<s.length()){
            
          
            if(hs.contains(s.charAt(end))){
                
                hs.clear();
                start++;
                end=start;
               
            }
            else{
                hs.add(s.charAt(end));
                end++;
                
            }
             max =Math.max(max,hs.size());
            
            
        }
      
        return max;
    } 
    // above soln slower not optimised
    // --> optimised code :
        //    int result = 0;
        // int[] cache = new int[256];
        // for (int i = 0, j = 0; i < s.length(); i++) {
        //     j = (cache[s.charAt(i)] > 0) ? Math.max(j, cache[s.charAt(i)]) : j;
        //     cache[s.charAt(i)] = i + 1;
        //     result = Math.max(result, i - j + 1);
        // }
        // return result;
}