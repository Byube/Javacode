package baekjoon3;

import java.util.Scanner;

public class Main6n {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			int m = s.nextInt();
			if (m == 0) break;
			int n = 0;
			//boolean b = true;
			int check = 0;
			for (int i = m + 1; i <= 2*m; i++) {
				int k = (int)Math.sqrt(i) + 1;
				for (int j = 2; j < k; j++) {
					if(i%j==0){
						n = 1;
						break;
					}
				}
				if (n==0) {
					check++;
				}
				n = 0;
			}
			System.out.println(check);
		}
		
	}

}
