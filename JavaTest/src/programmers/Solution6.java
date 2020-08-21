package programmers;

import java.util.Scanner;

public class Solution6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int check = n;
		String answer = "";
		String[] nala = { "4", "1", "2" };
		while (check > 0) {
			int i = check % 3;
			check /= 3;
			if(i == 0) check--;
			answer = nala[i] + answer;
		}
		System.out.println(answer);
	}
}
