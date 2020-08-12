package baekjoon;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		String[] str = new String[x];
		for (int i = 0; i < x; i++) {
			str[i] = s.next();
			int count = 0;
			int point = 0;
			for (int j = 0; j < str[i].length(); j++) {
				if(str[i].charAt(j)=='O'){
					point += ++count;
				} else {
					count = 0;
				}
			}
			System.out.println(point);
		}
		s.close();
	}

}
