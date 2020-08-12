package baekjoon3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		br.close();
		boolean b = true;
		for (int i = m; i <= n; i++) {
			if(i==1) {b = false;}
			int k = (int)Math.sqrt(i) + 1;
			for (int j = 2; j < k; j++) {
				if(i%j==0){
					b = false;
				}
			}
			if(b){
				bw.write(i+"\n");
				bw.flush();
			}
			b=true;
		}
	}

}

