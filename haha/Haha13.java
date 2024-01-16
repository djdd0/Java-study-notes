package haha;

import java.util.Scanner;

public class Haha13 {
	
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int number=0,letter=0,blank=0,others=0;
		String str = in.nextLine();
		while(!str.equals(""))
		{
			char a = str.charAt(0);
			if(a>='0' && a<='9')
			{
				number += 1;
			}
			else if((a>='a' && a<='z') || (a>='A' && a<='Z'))
			{
				letter += 1;
			}
			else if(a == ' ')
			{
				blank += 1;
			}
			else
			// {
				others += 1;
			}
			str = str.substring(1, str.length());
		}
		System.out.println("数字："+number+"个，字母："+letter+"个，空格："+blank+"个，其他："+others+"个");
	}

}
