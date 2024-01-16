package haha;

import java.util.Scanner;

public class Haha11
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(),in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();

	}

}
class Fraction
{
	int molecular;
	int denominator;
	Fraction(int a,int b)
	{
		for(int i=2;i<=(a>b?b:a);i++)
		{
			if(a%i==0&&b%i==0)
			{
				a/=i;
				b/=i;
				i-=1;
			}
		}
		molecular = a;
		denominator = b;
	}
	double toDouble()
	{
		Double result1 = (double)molecular/denominator;
		return result1;
	}
	Fraction plus(Fraction r)
	{
		int molecular1 = molecular * r.denominator +r.molecular * denominator;
		int denominator1 = denominator * r.denominator ;
		Fraction a1 = new Fraction(molecular1 , denominator1);
		return a1;
	}
	Fraction multiply(Fraction r)
	{
		int molecular1 =molecular * r.molecular ;
		int denominator1 = denominator * r.denominator ;
		Fraction a2 = new Fraction(molecular1 , denominator1);
		return a2;
	}
	void print()
	{
		if(molecular%denominator==0)
		{
			System.out.println(molecular/denominator);
		}
		else
		{
			System.out.println(molecular+"/"+denominator);
		}
	}
}

