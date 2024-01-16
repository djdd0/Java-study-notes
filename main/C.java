package main;

import java.util.Scanner;

public class C {

	private static Scanner in;
	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		int n,p0=1,p1=1,p2=0,q0=1,q1=1,q2=0;
		n = Integer.valueOf(in.nextLine());
		for(int l=0; l<n; l++)
		{
			p0=1;
			q0=1;
			String s =in.nextLine();
			for(int i=0; i<s.length()+1; i++)
			{
				for(int j=i;j<s.length()+1; j++)
				{
					p0 = 1;
					q0 = 1;
					p1 = 1;
					q1 = 1;
					p2 = 0;
					q2 = 0;
					for(int t=1; t<s.substring(i, j).length(); t++)
					{
						for(int h=1; h<(s.substring(i, j).length()/s.substring(i, j).substring(0, t).length())-1; h++)
						{
							if(s.substring(i+s.substring(i, j).substring(0, t).length()*h, i+s.substring(i, j).substring(0, t).length()*h+1).equals(s.substring(i, j).substring(0, t)))
							{
								p0++;
							}
						}
						if(s.substring(i, j).substring(0, t).startsWith(s.substring(i+s.substring(i, j).substring(0, t).length()*p0, i+s.substring(i, j).length())))
						{
							p1 = s.substring(i, j).substring(0, t).length();
							p2 = s.substring(i+s.substring(i, j).substring(0, t).length()*p0, i+s.substring(i, j).length()).length();
						}
					}
					if((double)p0+(double)p2/(double)p1 > (double)q0+(double)q2/(double)q1)
					{
						q0 = p0;
						q1 = p1;
						q2 = p2;
					}
				}
			}
			System.out.print(q0*q1+q2);
			System.out.print('/');
			System.out.print(q1);
			System.out.println();
		}
			
	}

}
