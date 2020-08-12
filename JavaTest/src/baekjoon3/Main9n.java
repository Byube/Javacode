package baekjoon3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main9n {
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] triangle = new int[3];
		while (true) {
			for (int i = 0; i < triangle.length; i++) {
				st = new StringTokenizer(br.readLine());
				triangle[i] = Integer.parseInt(st.nextToken());				
			}
			if (triangle[0]==0&&triangle[1]==0&&triangle[2]==0) {
				break;
			}
			
			Arrays.sort(triangle);
			int x = (int)Math.pow(triangle[2], 2);
			int y = (int)Math.pow(triangle[1], 2);
			int z = (int)Math.pow(triangle[0], 2);
			if(x == y + z){
				sb.append("right").append("\n");
			} else {
				sb.append("wrong").append("\n");
			}
			
		}
		System.out.println(sb);
	}
}

