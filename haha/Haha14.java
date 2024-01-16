package haha;

import java.util.Scanner;

public class Haha14 {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String str = in.nextLine();
		int target = in.nextInt();
		String[] numbs = str.split(" ");
		int leng = numbs.length;
		for (int i=0; i<leng; i++) {
			for (int j=i; j<leng; j++) {
				if (Integer.valueOf(numbs[i])+Integer.valueOf(numbs[j]) == target) {
					System.out.println(i+" "+j);
				}
			}
		}
	}
}
