
class Solution
{
    private class Pair{
        int i,j;
        Pair(int i,int j){
            this.j=j;
            this.i=i;
        }
    }
   
    public int[][] searchWord(char[][] grid, String word)
    {
        // Code here
        int size=word.length();
         ArrayList<Pair> al = new ArrayList<Pair>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
               boolean flag=false;
	            if(grid[i][j]==word.charAt(0)){
	                boolean n= search(grid,i,j,0,word,"n");    //north
	                boolean s= search(grid,i,j,0,word,"s");    //south
	                boolean e= search(grid,i,j,0,word,"e");    //east
	                boolean w= search(grid,i,j,0,word,"w");    //west
	                boolean ne= search(grid,i,j,0,word,"ne");  //north-east
	                boolean nw= search(grid,i,j,0,word,"nw");  //north-west
	                boolean se= search(grid,i,j,0,word,"se");  //south-east
	                boolean sw= search(grid,i,j,0,word,"sw");  //south-west
	                if(n||s||e||w||ne||nw||se||sw){
	                  al.add(new Pair(i,j));
	                }
                }
            }
        }
         int[][] ss = new int[al.size()][2];
        for(int i=0; i<al.size(); i++){
            int a = al.get(i).i;
            int b = al.get(i).j;
            ss[i][0] = a;
            ss[i][1] = b;
        }
        return ss;
    }
    boolean search(char[][]grid , int i , int j, int idx,String word,String dir)
    {
         if(i<0 || j<0 || i>=grid.length || 
         j>=grid[0].length|| grid[i][j]!=word.charAt(idx))
          return false;
         if(idx==word.length()-1)
          return true;
         boolean found=false;
         if(dir.equals("n"))
          found=search(grid,i-1,j,idx+1,word,"n");
          
          else if(dir.equals("s"))
          found=search(grid,i+1,j,idx+1,word,"s");
          
          else if(dir.equals("e"))
          found=search(grid,i,j+1,idx+1,word,"e");
          
          else if(dir.equals("w"))
          found=search(grid,i,j-1,idx+1,word,"w");
          
          else if(dir.equals("ne"))
          found=search(grid,i-1,j+1,idx+1,word,"ne");
          
          else if(dir.equals("nw"))
          found=search(grid,i-1,j-1,idx+1,word,"nw");
          
          else if(dir.equals("se"))
          found=search(grid,i+1,j+1,idx+1,word,"se");
          
          else if(dir.equals("sw"))
          found=search(grid,i+1,j-1,idx+1,word,"sw");
          
          return found;
    }
}