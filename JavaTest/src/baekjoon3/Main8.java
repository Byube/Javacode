package baekjoon3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main8 {

	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int givenNum = Integer.parseInt(st.nextToken());
			int firstPartitian = givenNum / 2;
			int secondPartitian = givenNum / 2;

			while (true) {
				if (isPrime(firstPartitian) && isPrime(secondPartitian)) {
					break;
				}
				firstPartitian--;
				secondPartitian++;

			}
			bw.write(firstPartitian + " " + secondPartitian + "\n");
		}
		bw.flush();
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}