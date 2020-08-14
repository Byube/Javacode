package programmers;

import java.util.Scanner;

public class Solution3n {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		int n = 10;
		int [] lost = {1,2,5,7,9};
		int[]reserve = {3,4,8};
		int answer = solution(n, lost, reserve);
		System.out.println(answer);
	}
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		for (int i = 0; i < reserve.length; i++) {
			boolean check = false;
			int j = 0;
			while (!check) {
				if(j==lost.length) break;
				if(reserve[i]==lost[j]){
					reserve[i] = -1;
					check = true;
				} else if (reserve[i] - 1 == lost[j]) {
					reserve[i] = -1;
					check = true;
				} else if (reserve[i] + 1 == lost[j]) {
					reserve[i] = -1;
					check = true;
				}
				else {
					j++;
				}
			}
			if(!check) answer++;
		}
		
		return answer;
	}

}
