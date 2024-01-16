package haha;

import java.util.Scanner;

public class Haha5 
{

	private static Scanner in;

	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		int on = in.nextInt();
		if(on == 0)
		{
			System.out.print("ling");
		}
		if(on < 0)
		{
			on = -on;
			System.out.print("fu ");
		}
		int n = on;
		int i = 0;
		for(; n > 0; i++)
		{
			n /= 10;
		}
		int m = on;
		int num = 0;
		int p = 1;
		for(; i>0; i--)
		{
			for(int c = 1; c < i; c++, p *= 10);
			num = m/p;
			m -= num*p;
			String o = null;
			switch(num)
			{
			case 1 :
				o = "yi";
				break;
			case 2 :
				o = "er";
				break;
			case 3 :
				o = "san";
				break;
			case 4 :
				o = "si";
				break;
			case 5 :
				o = "wu";
				break;
			case 6 :
				o = "liu";
				break;
			case 7 :
				o = "qi";
				break;
			case 8 :
				o = "ba";
				break;
			case 9 :
				o = "jiu";
				break;
			case 0 :
				o = "ling";
				break;
			}
			System.out.print(o);
			if(i != 1)
			{
				System.out.print(" ");
			}
			p = 1;
		}
	}
}
