package haha;

import java.util.Scanner;

public class Haha1 
{

	private static Scanner in;

	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		int num = in.nextInt();
		int ji = 0;
		int ou = 0;
		while (num != -1)
		{
			if (num%2 == 0)
			{
				ou = ou+1;
			}
			else if (num%2 == 1)
			{
				ji = ji+1;
			}
			num = in.nextInt();
		}
		System.out.println(ji + " " + ou);
		
	}

}
