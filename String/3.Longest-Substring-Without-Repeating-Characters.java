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
        //  Map<Character,Integer> indices = new HashMap<Character,Integer>();
        // int length = 0;
        // int start = -1;
        // int end = 0;
        // for(end=0; end < s.length(); end++){
        //     char c = s.charAt(end);
        //     if(indices.containsKey(c)){
        //         int newstart = indices.get(c);
        //         start = Math.max(start,newstart);
        //     }
        //     length = Math.max(length,end-start);
        //     indices.put(c,end);
        // }
        // return length;
}