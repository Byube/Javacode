package baekjoon;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[sc.nextInt()];
		
		//x�迭�� �� �ֱ�
		for (int i = 0; i < x.length; i++) {
			x[i]=sc.nextInt();
		}
		
		//min max�� �켱 x�迭�� ù��° �� �ֱ�
		int min = x[0];
		int max = x[0];
		
		//���� ������� �� �Ͽ� min�� max�� ���ϱ�
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
