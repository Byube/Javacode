package baekjoon3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int answer = (V - B) / (A - B);
		if((V - B) % (A - B) != 0) {
			answer ++;
		}
		System.out.println(answer);
		/*Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int v = s.nextInt();
		int today = 0;
		int answer = 0;
		
		while(today<v){
			answer++;
			today += a;
			if(today>=v) break;
			today -= b;
		}
		
		System.out.println(answer);*/
		
		
	}
}
