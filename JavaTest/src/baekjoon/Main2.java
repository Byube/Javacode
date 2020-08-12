package baekjoon;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int k = 0; k < x; k++) {
			for (int i = 1; i <= x; i++) {
				if (i%2!=0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			for (int i = 1; i <= x; i++) {
				if (i%2!=0) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}		
	}
}
