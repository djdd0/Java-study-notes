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
						System.out.println("��" + oi + "�����η�һֱ�ӵ�" + i + "�����η� ���� " + o + "�����η�");
					}
					n = 0;
				}
				
			}
			i = oi;
		}
	}

}
