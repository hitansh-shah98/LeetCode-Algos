class Solution {
    public boolean validPalindrome(String s) {
 int l = 0;
        int r = s.length()-1;
        while (l<=r){
            if (s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }
            else{
                
                return Palindrome(s.substring(l,r)) || Palindrome(s.substring(l+1,r+1));
            }
        }
        return true;
        }
       
    
     public boolean Palindrome(String S) {
        // code here
        int i=0;
        int j=S.length()-1;
        boolean count =false;
        if(S.length() == 1 ) return true;
        while(i<j){
            if(S.charAt(i) == S.charAt(j)){
             
                count=true;
            }
            else{
                count =false;
                break;
            }
            i++;
            j--;
        }
        return count;
    }
}