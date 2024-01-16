package project;

public class Project4
{
	public static void main(String[] args)
	{
		boolean j;
		int t=0;
		for(int n = 100; n<500; n++)
		{
			j = true;
			if(n<=1)
				j = false;
			for(int i=2; i<n; i++)
			{
				if(n%i == 0)
					j = false;
			}
			if(j)
				t++;
		}
		System.out.println(t);
	}

}
