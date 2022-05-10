class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = generate(rowIndex+1);
        return res.get(rowIndex);
    }
    public List<List<Integer>> generate(int numRows) {
        List<Integer> row=null , pre =null;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            row = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    row.add(1);
                else
                    row.add(pre.get(j-1) + pre.get(j));
                
            }
            pre=row;
            res.add(row);
        }
        return res;
    }
}

// optimised soln
//  public List<Integer> getRow(int rowIndex) {
        
//         int[] arr = new int[rowIndex + 1];
//         arr[0] = 1;
        
//         for (int i = 1; i <= rowIndex; i++) {
//             for (int j = i; j > 0; j--) {
//                 arr[j] += arr[j - 1];
//             }
//         }
        
//         List<Integer> res = new ArrayList<>();
//         for(int a : arr){
//             res.add(a);
//         }
//         return res;
//     }



/*
for numrows =3
i: 1 j:1
    1,1,0,0
i=2 j=2
        1,1,1,0
    j=1
        1,2,1,0
i=3 j=3
        1,2,1,1
        1,2,3,1
        1,3,3,1
*/
