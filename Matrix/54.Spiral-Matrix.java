class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       if(matrix == null || matrix.length == 0)
            return new ArrayList<Integer>();
        
        
       
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m-1, left = 0, right = n-1;
       int dir=0;
        List<Integer> ls = new ArrayList<Integer> ();
        while(top<=bottom && left<=right){
           if(dir==0){
               for(int i=left;i<=right;i++){
                   ls.add(matrix[top][i]);
               }
               top++;
           }
           else if(dir==1){
               for(int i=top;i<=bottom;i++){
                   ls.add(matrix[i][right]);
               }
               right--;
           }
           else if(dir==2){
               for(int i=right;i>=left;i--){
                   ls.add(matrix[bottom][i]);
               }
               bottom--;
           }
         else if(dir==3){
             for(int i=bottom;i>=top;i--){
                 ls.add(matrix[i][left]);
             }
             left++;
         }
            dir++;
            dir%=4;
       }
        return ls;
    }
}