package Test7;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		//Random r = new Random();
		//int[] score = { (r.nextInt(19) + 1) * 5, (r.nextInt(19) + 1) * 5, (r.nextInt(19) + 1) * 5, (r.nextInt(19) + 1) * 5, (r.nextInt(19) + 1) * 5 };
		int sum = 0;
		/*for (int i = 0; i < score.length; i++) {
			System.out.println("score" + i + " : " + score[i]);
			if (score[i] < 40) {
				score[i] = 40;
			}
			sum += score[i];
		}*/
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i] >= 40 ? score[i] : 40;
		}
		sc.close();
		int Average = sum / 5;
		System.out.println(Average);
	}

}
