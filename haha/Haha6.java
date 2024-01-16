package haha;

public class Haha6 
{
	public static void main(String[] args) 
	{
		int m;
		int n = 1;
		for(int i = 2; i <= 1290; i++)
		{
			m = 0;
			int oi = i;
			for(; i <= 1290; i++)
			{
				m += i*i*i;
				for(int o = i+1; o <= 1290 && n < m; o++)
				{
					n = o*o*o;
					if(m == n)
					{
						System.out.println("从" + oi + "的三次方一直加到" + i + "的三次方 等于 " + o + "的三次方");
					}
					n = 0;
				}
				
			}
			i = oi;
		}
	}

}
