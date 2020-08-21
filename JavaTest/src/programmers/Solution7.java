package programmers;

import java.util.HashSet;
import java.util.Set;

public class Solution7 {
	public static void main(String[] args) {
		Solution7 s7 = new Solution7("011");
	}

	public Solution7(String numbers) {
		int answer = 0;
		String[] strnum = numbers.split("");
		int[] intnum = new int[strnum.length];
		for (int i = 0; i < intnum.length; i++) {
			intnum[i] = Integer.parseInt(strnum[i]);
		}

		Set<Integer> set = new HashSet<Integer>();
		
		//1부터 만들 수 있는 모든 숫자 조합
		for (int i = 1; i < intnum.length; i++) {
			perm(strnum, 0, i, set);
		}
		System.out.println(set);
		answer = set.size();
		System.out.println(answer);
	}

	public void perm(String[] arr, int depth, int k, Set set) {
		if (depth == k) {
			print(arr, k, set);
			return;

		} else {
			for (int i = 0; i < arr.length; i++) {
				swap(arr, i, depth);
				perm(arr, depth + 1, k, set);
				swap(arr, i, depth);
			}
		}
	}

	public void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void print(String[] arr, int k, Set set) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
			sb.append(arr[i]);
		}
		isPrime(set, sb);
	}

	public void isPrime(Set set, StringBuilder sb) {
		int x = Integer.parseInt(String.valueOf(sb));

		boolean prime = true;

		if (x <= 1) {
			return;
		}
		for (int i = 2; i < Math.sqrt(x); i++) {
			if (x % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			set.add(x);
		}

	}
}
