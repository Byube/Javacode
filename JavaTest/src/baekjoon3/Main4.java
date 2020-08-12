package baekjoon3;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int answer = 0;
		boolean b = true;
		for (int i = 0; i < x; i++) {
			int num = s.nextInt();
			if(num<=1) {
				b = false;
			} else {
				for (int j = 2; j <= num/2; j++) {
					if(num%j==0) {
						b = false;
					}
				}
			}
			
			if (b) {
				answer++;
			}
			
			b = true;
		}
		
		System.out.println(answer);
	}
}
