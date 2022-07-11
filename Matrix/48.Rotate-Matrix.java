/*
 * clockwise rotate
 * first reverse up to down, then swap the symmetry 
 * 1 2 3     7 8 9     7 4 1
 * 4 5 6  => 4 5 6  => 8 5 2
 * 7 8 9     1 2 3     9 6 3
*/

class Solution {
    public void rotate(int[][] matrix) {
        
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
        
    }
}

/*
 * anticlockwise rotate
 * first reverse left to right, then swap the symmetry
 * 1 2 3     3 2 1     3 6 9
 * 4 5 6  => 6 5 4  => 2 5 8
 * 7 8 9     9 8 7     1 4 7
*/

//   int s = 0, e = matrix.length - 1;
//     while(s <= e){
//         int[] temp = matrix[s];
//         int l=0,r=temp.length-1;
//         while(l<r){
//             int temp2 = temp[l];
//             temp[l]=temp[r];
//             temp[r]=temp2;
//             l++;
//             r--;
//         }
//         s++; 
//     }
        
//         for(int i=0;i<matrix.length;++i){
//             for(int j=i+1;j<matrix[0].length;++j){
//                 int temp1 = matrix[i][j];
//                 matrix[i][j]= matrix[j][i];
//                  matrix[j][i]=temp1;
//             }
//         }
        
//     }