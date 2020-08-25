package programmers;

public class Solution9 {
	public static void main(String[] args) {
		int w = 8;
		int h = 7;
		long a = solution(w, h);
		System.out.println(a);
	}

	static long solution(int w, int h) {
		long answer = 0;
		long min = Math.min(w, h);
		long max = Math.max(w, h);
		long value = 1;
		while (value > 0) {
			value = max % min;
			max = min;
			min = value;
		}
		answer = (long)w * (long)h - ((long)w + (long)h - max);
		
		return answer;
	}
}
