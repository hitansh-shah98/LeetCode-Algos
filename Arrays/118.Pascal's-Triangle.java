class Solution {
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