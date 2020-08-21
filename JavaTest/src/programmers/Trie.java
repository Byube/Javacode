package programmers;

public class Trie {
	int count;
	Trie[] childList;

	public Trie() {
		childList = new Trie[26];
		count = 0;
	}

	public void insert(char[] word) {
		Trie current = this;
		for (char no : word) {
			++current.count;
			if (current.childList[no - 'a'] != null) {
				current = current.childList[no - 'a'];
			} else {
				current.childList[no - 'a'] = new Trie();
				current = current.childList[no - 'a'];
			}
		}
	}
	
	public int search(char[] query) {
		Trie current = this;
		for (char no : query) {
			if (no == '?') {
				return current.count;
			}
			
			if (current.childList[no-'a']!=null) {
				current = current.childList[no - 'a'];
			} else {
				return 0;
			}
		}
		return current.count;
	}

}
