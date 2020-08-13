package programmers;

import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		int n = 10;
		int [] lost = {1,2,5,7,9};
		int[]reserve = {3,4,8};
		int answer = solution(n, lost, reserve);
		System.out.println(answer);
	}
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n;
		for (int i = 0; i < lost.length; i++) {
			boolean rent = false;
			int j = 0;
			while(!rent) {
				if(j == reserve.length) break;
				if(lost[i] == reserve[j]) {
					reserve[j] = -1; 
					rent = true;
				} else if (lost[i] - reserve[j] == 1) {
					reserve[j] = -1; 
					rent = true;
				} else if (lost[i] - reserve[j] == -1) {
					reserve[j] = -1; 
					rent = true;
				} else {
					j++;
				}
			}
			if(!rent) answer--;
		}
		
		return answer;
	}
}
