package project;

import java.util.Scanner;

public class Project2
{
	private static Scanner in;
	
	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		int x = in.nextInt(),y;
		if(x<=0)
			y = 4;
		else if(x>0 && x<=10)
			y = 3*x;
		else if(x>10 && x<=200)
			y = x/2;
		else
			y = x%2;
		System.out.println(y);
	}

}
