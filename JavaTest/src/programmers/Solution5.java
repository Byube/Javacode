package programmers;

import java.util.ArrayList;

public class Solution5 {
	public static void main(String[] args) {
		int[] arr1 = { 4, 4, 4, 3, 3 };
		int[] arr2 = { 1, 1, 3, 3, 0, 1, 1 };
		
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		int check = -1010101010;
		for (int k : arr2){
			if(check!=k){
				list.add(k);
			}
			check = k;
		}
		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i).intValue();
		}
		
		for (int i : answer){
			System.out.println(i);
		}
		
		
	}

}
