package project;

import java.util.Scanner;

public class Project3
{
	private static Scanner in;
	
	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		int n=in.nextInt();
		boolean j = true;
		if(n<=1)
			j = false;
		for(int i=2; i<n; i++)
		{
			if(n%i == 0)
				j = false;
		}
		if(j)
			System.out.println(n + "是素数");
		else
			System.out.println(n + "不是素数");
	}

}
