package main;

import java.util.Scanner;

public class J {

	private static Scanner in;
	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		int n = 50;
		int[][] a = new int[52][52];
		for(int i=0; i<52; i++)
		{
			for(int j=0; j<52; j++)
			{
				a[i][j] = 1;
			}
		}
		for(int i=1; i<=n; i++)
		{
			String s =in.nextLine();
			n = s.length();
			for(int j=1; j<=n; j++)
			{
				switch (s.charAt(j-1))
				{
					case '.':
						a[i][j] = 0;//©у╟в
						break;
					case 'X':
						a[i][j] = 1;//╨Л
						break;
					case 'O':
						a[i][j] = 2;//бл
						break;
					default:
						break;
				}
			}
		}
		int b;
		boolean change = true;
		while(change)
		{
			change = false;
			for(int i=1; i<=n; i++)
			{
				for(int j=1; j<=n; j++)
				{
					b = 0;
					if(a[i][j] == 2)
					{
						if(a[i+1][j]==1)
						{
							b++;
						}
						if(a[i-1][j]==1)
						{
							b++;
						}
						if(a[i][j+1]==1)
						{
							b++;
						}
						if(a[i][j-1]==1)
						{
							b++;
						}
						if(b == 0 && i>1 && j>1)
						{
							if(a[i+1][j+1] == 2 && a[i-1][j-1] == 2 && a[i-1][j+1] == 2 && a[i+1][j-1] == 2 && a[i+1][j+2] == 1 && a[i-1][j-2] == 1 && a[i-1][j+2] == 1 && a[i+1][j-2] == 1 && a[i+2][j+1] == 1 && a[i-2][j-1] == 1 && a[i-2][j+1] == 1 && a[i+2][j-1] == 1)
							{
								change = true;
								a[i][j] = 0;
								a[i+1][j] = 1;
								a[i-1][j] = 1;
								a[i][j+1] = 1;
								a[i][j-1] = 1;
								a[i+1][j+1] = 0;
								a[i-1][j-1] = 0;
								a[i-1][j+1] = 0;
								a[i+1][j-1] = 0;
							}
						}
						if(b == 3)
						{
							change = true;
							if(a[i+1][j]==0)
							{
								a[i+1][j] = 1;
							}
							if(a[i-1][j]==0)
							{
								a[i-1][j] = 1;
							}
							if(a[i][j+1]==0)
							{
								a[i][j+1] = 1;
							}
							if(a[i][j-1]==0)
							{
								a[i][j-1] = 1;
							}
						}
						if(b == 4)
						{
							change = true;
							a[i][j] = 0;
						}
					}
				}
			}
		}
		int x = 0;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(a[i][j] == 0)
				{
					x++;
				}
			}
		}
		System.out.print(x);
	}
}
