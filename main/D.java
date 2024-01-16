package main;

import java.util.Scanner;

public class D {

	private static Scanner in;
	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		int n;
		double r,time;
		n = Integer.valueOf(in.nextLine());
		double[] x = new double[4];
		for(int i=0; i<4; i++)
		{
			r = 0;
			time = 0;
			String s =in.nextLine();
			for(int j=0; j<n; j++)
			{
				switch (s.charAt(j))
				{
					case '.'://平地
						if(r > 0)
						{
							time += 0.5;
							r -= 0.5;
						}
						else
						{
							time += 1;
						}
						break;
					case 'w'://水坑
						if(r > 0.5)
						{
							time += 1;
							r -= 1;
						}
						else if(r > 0)
						{
							time += 1.5;
							r -= 0.5;
						}
						else
						{
							time += 2;
						}
						break;
					case '>'://加速阵
						r = 5;
						if(r > 0)
						{
							time += 0.5;
							r -= 0.5;
						}
						else
						{
							time += 1;
						}
						break;
					case 's'://石块
						time += 1;
						if(r > 0)
						{
							r -= 1;
						}
						if(r > 0)
						{
							time += 0.5;
							r -= 0.5;
						}
						else
						{
							time+=1;
						}
						break;
					case 'm'://魔物
						time += 2;
						if(r > 0)
						{
							r -= 2;
						}
						if(r > 0)
						{
							time += 0.5;
							r -= 0.5;
						}
						else
						{
							time+=1;
						}
						break;
					default:
						break;
				}
			}
			x[i] = time;
		}
		System.out.print(x[0]);
		System.out.print(' ');
		System.out.print(x[1]);
		System.out.print(' ');
		System.out.print(x[2]);
		System.out.print(' ');
		System.out.print(x[3]);
	}
}
