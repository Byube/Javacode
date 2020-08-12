package baekjoon2;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		String an = "";
		for (int i = 0; i < x; i++) {
			int y = s.nextInt();
			String str = s.next();
			String[] answer = str.split("");
			for (int j = 0; j < answer.length; j++) {
				for (int k = 0; k < y; k++) {
					System.out.print(answer[j]);
				}
			}
			System.out.println();
		}
	}
}
