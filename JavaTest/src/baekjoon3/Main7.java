package baekjoon3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			int n = Integer.parseInt(br.readLine());		
			if (n == 0){
				break;
			}
			int check = getcheck(n);
			bw.write(check+"\n");
			bw.flush();
		}
		
	}
	public static int getcheck(int n) {
		int t = 0;
		int ck = 0;
		for (int i = n  + 1; i <= 2 * n; i++) {
			int k = (int)Math.sqrt(i) + 1;
			for (int j = 2; j < k; j++) {
				if(i%j == 0) {
					t = 1;
					break;
				}
			}
			if (t == 0) {
				ck++;
			}
			t = 0;
		}
		return ck;
	}
}
