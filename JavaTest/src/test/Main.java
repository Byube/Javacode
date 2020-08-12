package test;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		int y = x;		
		int count = 0;
		do {
			 y = y%10*10 + (y/10 + y%10)%10;
			count++;
		} while (x!=y);
		System.out.println(count);	
	}
}
