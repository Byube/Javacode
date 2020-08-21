package programmers;

import java.util.Arrays;

public class Solution8 {
	public static void main(String[] args) {
		String[] words = {"apple","orange","watermelon","dragonfruit","app","orran","water"};
		String[] queries = {"ap???","or???","wa???","wa???????","dragon?????","kr???"};
		Solution8 s = new Solution8(words,queries);
	}
	public Solution8(String[] words, String[] queries) {
		int[] answer = new int[queries.length];
		
		Trie[] tries = new Trie[10001];
		Trie[] rtries = new Trie[10001];
		
		for(String word : words) {
			int size = word.length();
			try {
				tries[size].insert(word.toCharArray());
			} catch (Exception e) {
				tries[size] = new Trie();
				tries[size].insert(word.toCharArray());
				// TODO: handle exception
			}
			
			word = (new StringBuffer(word)).reverse().toString();
			try {
				rtries[size].insert(word.toCharArray());
			} catch (Exception e) {
				rtries[size] = new Trie();
				rtries[size].insert(word.toCharArray());
			}
			
		}
		
		for (int i = 0; i < queries.length; ++i) {
			String query = queries[i];
			if (query.indexOf('?')==0) {
				try {
					query = (new StringBuffer(query)).reverse().toString();
					answer[i] = rtries[query.length()].search(query.toCharArray());
				} catch (Exception e) {
					continue;
				}
			} else {
				try {
					answer[i] = tries[query.length()].search(query.toCharArray());
				} catch (Exception e) {
					continue;
				}
			}
		}
		System.out.println(Arrays.toString(answer));
		
	}
}

