package baekjoon;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		int number = x * y * z;
		System.out.println("number : "+number);
		// 3개 숫자를 곱한 값을 자리수를 짜르고 그대로 배열 만들기
		int[] arr = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
		int[] answer = new int[10];
		int check = 1;
		//각 자리숫자 확인 하여 해당 숫자 만큼 ++
		for (int j = 0; j < arr.length; j++) {
				switch (arr[j]) {
				case 0:
					answer[0] += check;
					break;
				case 1:
					answer[1] += check;
					break;
				case 2:
					answer[2] += check;
					break;
				case 3:
					answer[3] += check;
					break;
				case 4:
					answer[4] += check;
					break;
				case 5:
					answer[5] += check;
					break;
				case 6:
					answer[6] += check;
					break;
				case 7:
					answer[7] += check;
					break;
				case 8:
					answer[8] += check;
					break;
				case 9:
					answer[9] += check;
					break;
				default:
					break;
				}
			}
		for (int i = 0; i < answer.length; i++) {
			System.out.println(i + ":" + answer[i]);
		}		
	}
}
