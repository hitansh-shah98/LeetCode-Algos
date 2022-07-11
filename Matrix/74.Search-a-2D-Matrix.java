class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i=0;
        int j=m-1;
        boolean found = false;
        while(i>=0 && i<n && j>=0 && j<m){
            if(matrix[i][j] == target)
            {
                found = true;
                return found;
            }
            if(matrix[i][j] > target)
                j--;
            else if (matrix[i][j] < target)
                i++;
                
        }
        return found;
//         boolean ans=false;
//         for(int i=0;i<matrix.length;i++){
//             int a[] = matrix[i];
            
//             int res =Arrays.binarySearch(a,target);
//             System.out.println("res: "+ res);
//             if(res>=0)
//                ans=true;
            
            
//         }
//         return ans;
    }
}