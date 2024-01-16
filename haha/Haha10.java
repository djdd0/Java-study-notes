package haha;

import java.util.Scanner;

public class Haha10 {

	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		String x = in.nextLine();
		while(!x.equals("*"))
		{
			signalInput1(x);
			x = in.next();
		}

	}

	private static int n = 0, val = 0;
	
	private static double t0 = 0, t1 = 0, t2 = 0;

	private static StringBuilder str1 = new StringBuilder();
	
	public static void signalInput1(String bytes) {

		str1.append(bytes);
		int data = 0;
		StringBuilder t = new StringBuilder();
		while(true)
		{
			
			if(str1.toString().substring(str1.indexOf("aa5509")+1).indexOf("aa5509") != -1)
			{
				if(str1.toString().startsWith("aa5509"))
				{
						t.append(str1.substring(12, 14));
						t.append(str1.substring(10, 12));
						data = Integer.parseInt(t.toString(), 16);
						if(data>32767)
							data = data-65535;
//						DrawMath.add(data);
						System.out.println(data);
						t.delete(0, 4);
				}
				str1.delete(0, str1.substring(str1.indexOf("aa5509")+1).indexOf("aa5509")+1);
			}
			else if(str1.substring(str1.indexOf("AA5509")+1).indexOf("AA5509") != -1)
			{
				if(str1.toString().startsWith("AA5509"))
				{
						t.append(str1.substring(12, 14));
						t.append(str1.substring(10, 12));
						data = Integer.parseInt(t.toString(), 16);
						if(data>32767)
							data = data-65535;
//						DrawMath.add(data);
						System.out.println(data);
						t.delete(0, 4);
				}
				str1.delete(0, str1.substring(str1.indexOf("AA5509")+1).indexOf("AA5509")+1);
			}
			else
				break;
		}
	}
	public static String signalOutput(int f, int a, int x) {
		String data = "";
		int check = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("EB9008");
		
		for (int i=Integer.toHexString(n).length(); i<4; i++)
			sb.append("0");
		
		sb.append(Integer.toHexString(n));
		
		n++;
		if(n == 65535)
			n = 0;
		
		switch (x)
		{
		case 0:
			val = (int)(Math.sin(6.28318530*f*t0)*a*5);
			
			t0 += 0.002;
			if(t0 == 1000.0/f)
				t0 = 0;
			
			break;
			
		case 1:
			if(t1 > 1.0/(2*f))
			{
				if(t2 == 0)
					t2 = 1;
				else
					t2 = 0;
				
				t1=0;
			}
			else 
			{
				if(t2 == 1)
					val += a*2.0/f;
				else
					val -= a*2.0/f;
				
				t1 += 0.002;
			}
			
			break;
			
		case 2:
			if(t1 > 1.0/(2*f))
			{
				if(val == a*5)
					val = -a*5;
				else
					val = a*5;
				
				t1=0.002;
			}
			else
			{	
				t1 += 0.002;
			}
			
			break;
		}
		
		System.out.println(val);
		
		for (int i=Integer.toHexString(val).length(); i<4; i++)
			sb.append("0");	
		
		sb.append(Integer.toHexString(val));
		
		for (int i=Integer.toHexString(val).length(); i<4; i++)
			sb.append("0");	
		
		sb.append(Integer.toHexString(val));
		
		for(int i=4; i<18; i+=2)
			check += Integer.parseInt(sb.toString().substring(i, i+2), 16);
		
		for (int i=Integer.toHexString(check).length(); i<4; i++)
			sb.append("0");	
		
		sb.append(Integer.toHexString(check));
		
		sb.append("0c");
		
		data = sb.toString();
		
		return data;
	}


}
