package programmers;

import java.util.Scanner;

public class Solution3n {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 1, 3, 5 };
		int answer = solution(n, lost, reserve);
		System.out.println(answer);
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		for (int i = 0; i < reserve.length; i++) {
			for (int j = 0; j < lost.length; j++) {
				if (reserve[i] == -10 && lost[j] == -10) {
					continue;
				}
				if (reserve[i] == lost[j]) {
					reserve[i] = -10;
					lost[j] = -10;
					answer++;
				}
			}
		}
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (reserve[j] == -10 || lost[i] == -10) {
					continue;
				}
				if (Math.abs(lost[i] - reserve[j]) == 1) {
					answer++;
					reserve[j] = -10;
					break;
				}
			}
		}
		return answer;
	}

}
