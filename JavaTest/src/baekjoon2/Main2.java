package baekjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int sum = 0;
		String str = st2.nextToken();
		br.close();
		for (int i = 0; i < x; i++) {
			sum += str.charAt(i)-'0'; 
		}
		System.out.println(sum);
		
	}
}
