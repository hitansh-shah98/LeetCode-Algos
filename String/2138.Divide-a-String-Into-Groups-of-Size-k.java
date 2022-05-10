class Solution {
    public String[] divideString(String s, int k, char fill) {
        if(s.length()%k > 0)
        {
            int count = k - s.length()%k;
            while(count>0){
                s+=fill;
                count--;
            }
            System.out.println("S: " +s);
        }
        String arr [] = new String[s.length()/k];
                                    
        for(int i=0,j=0;i<s.length();i+=k,j++){
            
            arr[j] = s.substring(i,i+k);
        }
        return arr;    
    }
}