class Solution {
    public void setZeroes(int[][] matrix) {
        
        
        boolean [][] visited = new boolean[matrix.length][matrix[0].length];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                 if(matrix[i][j] == 0 &&   visited[i][j]==false){
                     
                      for(int k=0;k<matrix.length;k++){
                          if(matrix[k][j]!=0)
                          {
                                matrix[k][j]=0;
                              visited[k][j]=true;
                          }
                      }
                      for(int l=0;l<matrix[0].length;l++ ){
                          if(matrix[i][l]!=0){
                              matrix[i][l]=0;
                            visited[i][l]=true;
                          }
                      }
                 }
                }
            }
        
        
       
    }
   
}