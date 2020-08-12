package baekjoon;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[sc.nextInt()];
		
		//x배열에 값 넣기
		for (int i = 0; i < x.length; i++) {
			x[i]=sc.nextInt();
		}
		
		//min max에 우선 x배열의 첫번째 값 넣기
		int min = x[0];
		int max = x[0];
		
		//값을 순서대로 비교 하여 min와 max를 구하기
		for (int i = 0; i < x.length; i++) {
			if (max < x[i]) {
				max = x[i];
			}
			if (min > x[i]) {
				min = x[i];
			}
		}
		sc.close();		
		System.out.println(min + " " + max);
	}
}
