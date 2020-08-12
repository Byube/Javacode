package baekjoon2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		int answer = a.hashCode();
		System.out.println(answer);
	}
}
