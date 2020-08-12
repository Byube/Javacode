package test;

import java.util.Scanner;

public class Test1 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int x = sc.nextInt();
		int []a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < a.length; i++) {
			if(a[i]<x){
				System.out.println(a[i] + "");
			}
		}
	}

}
