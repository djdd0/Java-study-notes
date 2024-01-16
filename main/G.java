package main;

import java.util.Scanner;

public class G {

	private static Scanner in;
	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		long[] f=new long[200];
		long a , b, ans, c=0, sum=0;
		int k, l, r, i, j;
		k = in.nextInt();
		a = in.nextInt();
		b = in.nextInt();
		l = in.nextInt();
		r = in.nextInt();
		f[0]=1;
		f[1]=1;
		for(i=2;i<r;i++)
			f[i]=(a*f[i-1]+b*f[i-2])% 1000000007;
		for(j=l;j<=r;j++)
		{
			ans = 1;
	    	for(i=1; i<=f[j-1]; i++)
	        	ans*=i;
	    	for(i=1; i<=k; i++)
	        	ans/=i;
	    	for(i=1; i<=f[j-1]-k; i++)
	        	ans/=i;
	    	c = ans ;
	    	sum += c;
		}
		System.out.print(sum);
	}
}
