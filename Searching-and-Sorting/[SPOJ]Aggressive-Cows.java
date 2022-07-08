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
			int n=sc.nextInt();
			int c=sc.nextInt();
				//System.out.println("tc: " + n);
					//System.out.println("tc: " + c);
			int [] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				//System.out.println("arr: " + arr[i]);
			}
			Arrays.sort(arr);
			int low=0,high=arr[n-1];
			int best=0;
			while(low<=high){
				int mid= (low+high+1)/2;
				int cnt=1,left=0;
				for(int i=1;i<n&&cnt<c ; i++){
					if(arr[i]-arr[left]>=mid){
						left=i;
						cnt++;
					}
				}
				if(cnt>=c){
					best=mid;
					low=mid+1;
				}
				else
					high=mid-1;	
			}
			System.out.println(best);
			tc--;
		}
	}
}