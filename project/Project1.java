package project;

import java.util.Scanner;

public class Project1
{
	private static Scanner in;
	
	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		boolean k;
		int n,t=0,l=0;
		int N = in.nextInt();
		int M = in.nextInt();
		String title;
		String text;
		String[] word = new String[M*5000];
		int[] count = new int[M*5000];
		in.nextLine();
		for(int i=0; i<M; i++)
		{
			title = in.nextLine()+" ";
			text = in.nextLine()+" ";
			while(!title.equals(""))
			{
				n = title.indexOf(" ");
				k = true;
				for(int j=0; j<t; j++)
				{
					if(word[j].equals(title.substring(0, n)))
					{
						k = false;
						count[j] += 3;
					}
				}
				if(k)
				{
					word[t] = title.substring(0, n);
					count[t] = 3;
					t++;
				}
				title = title.substring(n+1, title.length());
			}
			while(!text.equals(""))
			{
				n = text.indexOf(" ");
				k = true;
				for(int j=0; j<t; j++)
				{
					if(word[j].equals(text.substring(0, n)))
					{
						k = false;
						count[j] += 1;
					}
				}
				if(k)
				{
					word[t] = text.substring(0, n);
					count[t] = 1;
					t++;
				}
				text = text.substring(n+1, text.length());
			}
			
		}
		for(int i=M*5000; i>0; i--)
		{
			for(int j=0; j<t; j++)
			{
				if(count[j] == i)
				{
					if(l >= N)
					{
						break;
					}
					System.out.print(word[j]+" ");
					l++;
				}
			}
		}
	}

}
