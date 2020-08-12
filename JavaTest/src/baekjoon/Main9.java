package baekjoon;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			int sum = 0;
			double Average = 0.0;
			double count = 0.0;
			double answer = 0.0;
			int[] pi = new int[s.nextInt()];
			for (int j = 0; j < pi.length; j++) {
				pi[j] = s.nextInt();
				sum += pi[j];
			}
			/*for(int k : pi){
				sum += k;
			}*/
			Average = sum / pi.length;
			//System.out.println("∆Ú±’ : " + Average);
			
			for (int j = 0; j < pi.length; j++) {
				if(pi[j]>Average){
					count++;
				}
			}
			//System.out.println("∆Ú±’¿ÃªÛ : " + count);
			answer = (count * 100) / pi.length;
			System.out.format("%.3f%%%n",answer);
		}		
	}
}
