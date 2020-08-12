package baekjoon3;

import java.io.*;

public class Main5n {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 0;
		for (int i = x; i <= y; i++) {
			if (isPrime(i)) {
				sum += i;
				if (min == 0) {
					min = i;
				}
			}
		}
		bw.write(sum > 0 ? (sum + "\n" + min) : (-1+"\n"));
		bw.flush();
	}

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} else {
			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
