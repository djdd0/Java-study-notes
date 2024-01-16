package haha;

import java.util.Scanner;

public class Haha8 
{
	
	private static Scanner in;
	
	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		int[] n = new int[15];
		int h,t,th=0,tm=0,ts=0;
		String s,a,j,st;
		s = in.nextLine();
		while(!s.equals("END"))
		{
			if(s.startsWith("$GPRMC"))
			{
				h = s.charAt(1);
				for(int i=2; i<s.indexOf("*"); i++)
					{
						h ^= s.charAt(i);
					}
				j = Integer.toHexString(h%65536);
				if(s.endsWith(j))
				{
					for(int i=0,k=0; k<12; i++)
					{
						if(s.charAt(i) == ',')
						{
							n[k] = i;
							k++;
						}
					}
					a = s.substring(n[1]+1, n[2]);
					if(a.equals("A"))
					{
						st = s.substring(n[0]+1, n[1]);
						t = Integer.parseInt(st.substring(0, 6));
						ts = t%100;
						t /= 100;
						tm = t%100;
						th = t/100;
					}
				}
			}
			s = in.nextLine();
		}
		if(th >= 16)
		{
			th -= 16;
		}
		else
		{
			th += 8;
		}
		if(th < 10)
		{
			System.out.print("0");
		}
		System.out.print(th + ":");
		if(tm < 10)
		{
			System.out.print("0");
		}
		System.out.print(tm + ":");
		if(ts < 10)
		{
			System.out.print("0");
		}
		System.out.print(ts);
	}
}
