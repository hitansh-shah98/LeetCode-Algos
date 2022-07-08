class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        int count=1;
        while(count<=4){
        if(check(mat,target))
            return true;
        else
            mat = rotate(mat);
        count++;
        }
        return false;
        
    }
    public int [][] rotate(int[][] matrix) {
        
      int s = 0, e = matrix.length - 1;
    while(s < e){
        int[] temp = matrix[s];
        matrix[s] = matrix[e];
        matrix[e] = temp;
        s++; e--;
    }
        
        for(int i=0;i<matrix.length;++i){
            for(int j=i+1;j<matrix[0].length;++j){
                int temp1 = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                 matrix[j][i]=temp1;
            }
        }
        return matrix;
        
    }
    public boolean check(int[][] a, int[][] b){
         int row1, col1, row2, col2;    
        boolean flag = true;    
        
        row1 = a.length;    
        col1 = a[0].length;    
            
        //Calculates the number of rows and columns present in the second matrix    
    
          row2 = b.length;    
        col2 = b[0].length;    
            
        //Checks if dimensions of both the matrices are equal    
        if(row1 != row2 || col1 != col2){    
            //System.out.println("Matrices are not equal");    
            flag=false;
        }    
        else {    
            for(int i = 0; i < row1; i++){    
                for(int j = 0; j < col1; j++){    
                  if(a[i][j] != b[i][j]){    
                      flag = false;    
                      break;    
                  }    
                }    
            }    
                
           
        } 
        return flag;
    }
}