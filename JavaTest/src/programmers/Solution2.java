package programmers;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int z = 0;
		int x = 30;
		int y = 31;
		int k = 29;
		String answer = "";
		switch (a) {
		case 1:
			if(b>31) {
				answer = "1월은 31일까지 만 있습니다.";
			} else {
				answer = getWeek(b);
			}
			System.out.println(answer);
			break;
		case 2:
			if(b>29) {
				answer = "2월은 29일까지 만 있습니다.";				
			} else {
				z += y;
				answer = getWeek(b+z);				
			}
			System.out.println(answer);
			break;			
		case 3:
			if(b>31) {
				answer = "3월은 31일까지 만 있습니다.";
			} else {
				z += y + k;
				answer = getWeek(b+z);
			}
			System.out.println(answer);
			break;
		case 4:
			if(b>30) {
				answer = "4월은 30일까지 만 있습니다.";
			} else {
				z += 2 * y + k;
				answer = getWeek(b+z);
			}
			System.out.println(answer);
			break;
		case 5:
			if(b>31) {
				answer = "5월은 31일까지 만 있습니다.";
			} else {
				z += 2 * y + k + x;
				answer = getWeek(b+z);
			}
			System.out.println(answer);
			break;
		case 6:
			if(b>30) {
				answer = "6월은 30일까지 만 있습니다.";
			} else {
				z += 3 * y + k + x;
				answer = getWeek(b+z);
			}
			System.out.println(answer);
			break;
		case 7:
			if(b>31) {
				answer = "7월은 31일까지 만 있습니다.";
			} else {
				z += 3 * y + k + 2 * x;
				answer = getWeek(b+z);
			}
			System.out.println(answer);
			break;
		case 8:
			if(b>31) {
				answer = "8월은 31일까지 만 있습니다.";
			} else {
				z += 4 * y + k + 2 * x;
				answer = getWeek(b+z);
			}
			System.out.println(answer);
			break;
		case 9:
			if(b>30) {
				answer = "9월은 30일까지 만 있습니다.";
			} else {
				z += 5 * y + k + 2 * x;
				answer = getWeek(b+z);
			}
			System.out.println(answer);
			break;
		case 10:
			if(b>31) {
				answer = "10월은 31일까지 만 있습니다.";
			} else {
				z += 5 * y + k + 3 * x;
				answer = getWeek(b+z);
			}
			System.out.println(answer);
			break;
		case 11:
			if(b>30) {
				answer = "11월은 30일까지 만 있습니다.";
			} else {
				z += 6 * y + k + 3 * x;
				answer = getWeek(b+z);
			}
			System.out.println(answer);
			break;
		case 12:
			if(b>31) {
				answer = "12월은 31일까지 만 있습니다.";
			} else {
				z += 6 * y + k + 4 * x;
				answer = getWeek(b+z);
			}
			System.out.println(answer);
			break;
		default:
			answer = "1~12월 까지 입력 바랍니다.";
			System.out.println(answer);
			break;
		}
	}
	public static String getWeek(int x){
		switch (x%7) {
		case 1:
			return "FRI";
		case 2:
			return "SAT";
		case 3:
			return "SUN";
		case 4:
			return "MON";
		case 5:
			return "TUE";
		case 6:
			return "WED";
		default:
			return "THU";
		}
	}
}
