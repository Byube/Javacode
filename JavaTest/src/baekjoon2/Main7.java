package baekjoon2;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int count = 0;
		if(B>=C){
			count = -1;
		} else {
			count = A / (C-B) + 1;
		}		
		System.out.println(count);		
	}
}
