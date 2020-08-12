package baekjoon3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
	
	static int[][] APT = new int[15][15];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		makeAPT();
		int x = Integer. parseInt(br.readLine());
		for (int i = 0; i < x; i++) {
			int k = Integer. parseInt(br.readLine());
			int n = Integer. parseInt(br.readLine());
			System.out.println(APT[k][n]);
		}
	}
	public static void makeAPT(){
		for (int i = 1; i < APT.length; i++) {
			APT[i][1] = 1;
			APT[0][i] = i;
		}
		for (int i = 1; i < APT.length; i++) {
			for (int j = 2; j < APT.length; j++) {			
				APT[i][j] = APT[i][j-1] + APT[i-1][j];
				//System.out.println("APT [" + i + "] [" + j + "] = " + APT[i][j]);
			}
		}
		
	}
}
