package programmers;

public class Solution4 {
	public static void main(String[] args) {
		String answer = "";
		String s = "abcdde";
		answer = solution(s);
		System.out.println(answer);
	}
	public static String solution(String s) {
		String answer = "";
		int x = s.length() / 2;
		if (s.length() % 2 != 0) {
			answer = String.valueOf(s.charAt(x));
		} else {
			answer = answer.concat(String.valueOf(s.charAt(x-1)));
			answer = answer.concat(String.valueOf(s.charAt(x)));		
		}
		
		return answer;
	}
}
