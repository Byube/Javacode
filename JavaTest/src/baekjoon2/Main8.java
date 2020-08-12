package baekjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int answer = 0;
		while (N%5!=0&&N>=0) {
			N -= 3;		
			answer++;
		}
		if(N<0) {
			answer = -1;
		} else {
			System.out.println(answer + (N / 5));
		}
	}
}
