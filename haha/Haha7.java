package haha;

import java.util.Scanner;

public class Haha7 
{
	private static Scanner in;

	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		int[] num = new int[104];
		int m;
		int x;
		m = in.nextInt();
		x = in.nextInt();
		num[m] += x;
		while( m!=0 )
		{
			m = in.nextInt();
			x = in.nextInt();
			num[m] += x;
		}
		m = in.nextInt();
		x = in.nextInt();
		num[m] += x;
		while( m!=0 )
		{
			m = in.nextInt();
			x = in.nextInt();
			num[m] += x;
		}
		boolean p = true;
		for(int i = 100; i > 1; i--)
		{
			if(num[i] != 0)
			{
				switch (num[i]) 
				{
					case 1:
						System.out.print("x" + i);
						break;
					case -1:
						System.out.print("-x" + i);
						break;
					default:
						System.out.print(num[i] + "x" + i);
						break;
				}
				num[101] = num[i];
				num[i] = 0;
				p = false;
				break;
			}
		}
		if(p)
		{
			int o = 0;
			if(num[1] != 0)
			{
				switch (num[1]) 
				{
					case 1:
						System.out.print("x");
						break;
					case -1:
						System.out.print("-x");
						break;
					default:
						System.out.print(num[1] + "x");
						break;
				}
				o = num[1];
				num [102] = num[1];
				num[1] = 0;
			}
			if(num[0] != 0)
			{
				if(num[0] > 0 && o != 0)
				{
					System.out.print("+");
				}
					System.out.print(num[0]);
					num[103] = num[0];
					num[0] = 0;
			}
		}
		for(int i = 100; i>1; i--)
		{
			if(num[i] != 0)
			{
				if(num[i] > 0)
				{
					System.out.print("+");
				}
				switch (num[i]) 
				{
					case 1:
						System.out.print("x" + i);
						break;
					case -1:
						System.out.print("-x" + i);
						break;
					default:
						System.out.print(num[i] + "x" + i);
						break;
				}
			}
		}
		if(num[1] != 0)
		{
			if(num[1] > 0)
			{
				System.out.print("+");
			}
			switch (num[1]) 
			{
				case 1:
					System.out.print("x");
					break;
				case -1:
					System.out.print("-x");
					break;
				default:
					System.out.print(num[1] + "x");
					break;
			}
		}
		if(num[0] != 0)
		{
			if(num[0] > 0)
			{
				System.out.print("+");
			}
				System.out.print(num[0]);
		}
		boolean l = true;
		for(int i = 0; i <= 103; i++)
		{
			if(num[i] != 0)
			{
				l = false;
				break;
			}
		}
		if(l)
		{
			System.out.print("0");
		}
	}
}