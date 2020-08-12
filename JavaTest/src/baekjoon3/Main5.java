package baekjoon3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {

	static boolean b = true;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		answer(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()));
	}

	public static void answer(int x, int y) {
		int sum = 0;
		int[] check = new int[y-x];
		int r = 0;
		for (int i = x; i <= y; i++) {
			if (i<=1){
				b = false;
			} else {
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						b = false;
					}
				}
			}			
			if (b) {
				check[r++] = i;
				sum += i;
			}
			b = true;
		}
		System.out.println(sum > 0 ? (sum + "\n" + check[0]) : -1);

	}
}
