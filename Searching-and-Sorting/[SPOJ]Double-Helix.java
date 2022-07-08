import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	while(true){	
		int n = sc.nextInt();
		if(n==0)
			break;
		else{
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int m=sc.nextInt();
			int b[]=new int[m];
			for(int i=0;i<m;i++){
				b[i]=sc.nextInt();
			}
			
			int i=0,j=0;
			int sum=0,sum1=0,sum2=0;
			while(i<n && j<m){
				if(a[i]<b[j]){
					sum1+=a[i];
					i++;
				}
				else if(a[i]>b[j]){
					sum2+=b[j];
					j++;
				}
				else{
					sum+=Math.max(sum1,sum2)+a[i];
					sum1=0;
					sum2=0;
					i++;
					j++;
				}
			}
			while(i<n){
				sum1+=a[i];
				i++;
			}
			while(j<m)
			{
				sum2+=b[j];
				j++;
			}
			sum+=Math.max(sum1,sum2);
			System.out.println(sum);
		}
	}
	}
}