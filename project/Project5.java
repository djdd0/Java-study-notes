package project;

public class Project5
{
	public static void main(String[] args)
	{
		int t=0,a;
		for(int n = 100; n<500; n++)
		{
			a = 1;
			for(int i=2; i<n; i++)
			{
				if(n%i == 0)
					a += i;
			}
			if(n == a)
				t++;
		}
		System.out.println(t);
	}
	
}
