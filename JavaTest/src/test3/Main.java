package test3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n;
		
		int[] out = new int[11];
		out[1] = 1;
		out[2] = 2;
		out[3] = 4;
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			for (int j = 4; j <=n; j++) {
				out[j] = out[j-1] + out[j-2] + out[j-3];
			}
			System.out.println(out[n]);
		}
	}
	
	
}
