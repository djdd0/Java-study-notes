package haha;

import java.util.Scanner;

public class Haha 
{

	private static Scanner in;

	public static void main(String[] args) 
	{
	in = new Scanner(System.in);
	int num = (int)(Math.random()*100+1);
	int a;
	int count = 0;
	do {
		a = in.nextInt();
		count = count+1;
		if (a > num)
		{
			System.out.println("ƫ��");
		}
		else if (a < num)
		{
			System.out.println("ƫС");
		}
	}while(a != num);
	System.out.println("��ϲ��¶���,�����"+count+"��");
	}

}
