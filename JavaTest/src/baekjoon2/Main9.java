package baekjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main9 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int line = 0;
		int cnt = 0;
		int molecule = 0;
		int denominator = 0;
		while (cnt<x) {
			line ++;
			cnt = line * (line + 1) / 2;
		}
		if(line%2==0){
			molecule = line - (cnt - x);
			denominator = (cnt - x) + 1; 
		} else {
			molecule = (cnt - x) + 1;
			denominator = line - (cnt - x);
		}
		System.out.println(molecule + "/" + denominator);
	}

}
