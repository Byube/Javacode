package baekjoon3;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int z = s.nextInt();
		int x = 0;
		int y = 0;
		for (int i = 0; i < z; i++) {
			int h = s.nextInt();
			int w = s.nextInt();
			int n = s.nextInt();
			x = n / h + 1;
			y = n % h;
			if ( n % h == 0) {
				x = n / h;
				y = h;
			}
			System.out.println(y * 100 + x);
		}
	}
}
