import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int tc = sc.nextInt();
		//System.out.println("tc: " + tc);
	
		while(tc>0){
			int paratha=sc.nextInt();
			int chefs=sc.nextInt();
				//System.out.println("tc: " + n);
					//System.out.println("tc: " + c);
			int [] arr = new int[chefs];
			for(int i=0;i<chefs;i++){
				arr[i]=sc.nextInt();
				//System.out.println("arr: " + arr[i]);
			}
			
			int low=0,high=Integer.MAX_VALUE;
			int best=0;
			while(low<=high){
				int mid= low + (high-low)/2;
				if(solve(arr,paratha,chefs,mid))
				{
					best=mid;
					high=mid-1;
				}
				else
					low=mid+1;	
			}
			System.out.println(best);
			tc--;
		}
	}
	static boolean solve(int [] arr,int paratha,int chefs,int mid){
		int time=0;
		int count=0;
		for(int i=0;i<chefs;i++){
			time=arr[i];
			int j=2;
			while(time<=mid){
				count++;
				time=time + arr[i]*j;
				j++;
			}
			if(count>=paratha) return true;
			
		}
		return false;
	}
}