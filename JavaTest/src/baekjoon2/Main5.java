package baekjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		System.out.println(st.countTokens());
		br.close();
		/*if(str.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(str.split(" ").length);
		}		*/
	}
}
