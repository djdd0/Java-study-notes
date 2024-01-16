package haha;

import java.util.Scanner;

public class Haha4 
{

	private static Scanner in;

	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int r = 0;
		int num = 2;
		for(int i = 0; i < m; num++)
		{
			boolean j = true;
			for(int p = 2; p < num; p++)
			{
				if(num % p == 0)
				{
					j = false;
					break;
				}
			}
			if(j)
			{
				i++;
				if(i >= n)
				{
					r += num;
				}
			}
		}
		System.out.println(r);
	}

}
