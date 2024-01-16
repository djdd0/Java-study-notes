package haha;

import java.util.Scanner;

public class Haha9 {

	public static void runTask() {
	final long timeInterval = 2;
	Runnable runnable = new Runnable() {
		public void run() {
			while (true)
			{
				
				System.out.println("11");
					
				try{
					Thread.sleep(timeInterval);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	Thread thread = new Thread(runnable);
	thread.start();
	}

	private static Scanner in;

	public static void main(String[] args) 
	{
	runTask();
	in = new Scanner(System.in);
	int num = (int)(Math.random()*100+1);
	int a;
	int count = 0;
	do {
		a = in.nextInt();
		count = count+1;
		if (a > num)
		{
			System.out.println("偏大");
		}
		else if (a < num)
		{
			System.out.println("偏小");
		}
	}while(a != num);
	System.out.println("恭喜你猜对了,你猜了"+count+"次");
	}

}
