package programmers;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		long answer = 0;
		if (a<b) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		}
		
		System.out.println(answer);
	}
}
