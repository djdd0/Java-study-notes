	package haha;

	import java.util.Scanner;

	public class Haha3 
	{

		private static Scanner in;

		public static void main(String[] args) 
		{
			in = new Scanner(System.in);
			int m = in.nextInt();
			for(int n = 2; n <= m ; n++)
			{
				boolean j = true;
				for(int i = 2; i < n; i++)
				{
					if(n % i == 0)
					{
						j = false;
						break;
					}
				}
				if(j)
				{
					System.out.print(n + " ");
				}
			}

		}

	}
