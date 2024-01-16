package haha;

import java.util.Scanner;

public class Haha2 
{

	private static Scanner in;

	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		int num = in.nextInt();
		int wei = 1;
		int shu = 0;
		int sshu = 0;
		int swei = 0;
		int zhi = 1;
		int result = 0;
		while(num != 0)
		{
			shu = num%10;
			sshu = shu%2;
			swei = wei%2;
			if(sshu == swei)
			{
				result = result + zhi;
			}
			
			num = num/10;
			wei = wei + 1;
			zhi = zhi*2;
		}
		System.out.println(result);
	}

}
