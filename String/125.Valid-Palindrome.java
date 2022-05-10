class Solution {
    public boolean isPalindrome(String s) {
        
         s = s.toLowerCase();
         
        int left = 0, right = s.length() - 1;
        while(left < right){
            
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
        
    }

   
}

// using java built-in methods
//  s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();  
//         String rev = new StringBuffer(s).reverse().toString();
//         //System.out.println("String: " +s);
        
//         return s.equals(rev);



// checking for palindrome using just while loop
//  public boolean Palindrome(String S) {
//         // code here
//         int i=0;
//         int j=S.length()-1;
//         boolean count =false;
//         if(S.length() == 1 ) return true;
//         while(i<j){
//             if(S.charAt(i) == S.charAt(j)){
             
//                 count=true;
//             }
//             else{
//                 count =false;
//                 break;
//             }
//             i++;
//             j--;
//         }
//         return count;
//     }
        