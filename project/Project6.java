package project;

import java.util.Scanner;

public class Project6 {

	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		int m,t;
		int n = in.nextInt();
		int[] a = new int[n];
		int[] c = new int[n];
		String s,x;
		int[][] num = new int[n][n];
		
		for(int i=0; i<n; i++)
		{
			t = 0;
			s = in.next();
			while(s.indexOf(",") != -1)
			{
				m = s.indexOf(",");
				num[i][t] = Integer.valueOf(s.substring(0, m));
				t ++;
				s = s.substring(m+1, s.length());
			}
			num[i][t] = Integer.valueOf(s);
			t ++;
		}
		for(int i=0; i<n; i++)
		{
			a[i] = in.nextInt();
		}
		t = 0;
		x = in.nextLine();
		x = in.nextLine();
		for(int i=0; i<x.length(); i++)
		{
			if(x.charAt(i)<'9' && x.charAt(i)>'0')
			{
				if(i>0 && x.charAt(i-1)<'9' && x.charAt(i-1)>'0')
				{
					c[t] = c[t]*10+x.charAt(i)-'0';
				}else
				{
					c[t] = x.charAt(i)-'0';
					t ++;
				}
			}
		}
		for(int i=0; i<t; i++)
		{
			for(int j=0; j<n; j++)
			{
			}
			
		}
		
		
		for(int i=0; i<t; i++)
		{
			System.out.print(c[i]+" ");
			
		}
		
	}

}
