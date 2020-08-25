package programmers2;

public class Solution {
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"DKCB","AKKK,JIJCJKJKB","IUTKCKDBK","EIRUCKABKKKD","OPLIKCLLBLL","OPUIKJCKKIBD"};
		int answer = Solutions(skill, skill_trees);
		System.out.println(answer);
	}
	static int Solutions(String Skill, String[] skill_trees) {
		int answer = skill_trees.length;		
		int beforeIdx = 0, currentIdx = 0;
		
		for (int i = 0; i < skill_trees.length; i++) {
			beforeIdx = skill_trees[i].indexOf(Skill.charAt(0));
			
			for (int j = 0; j < Skill.length(); j++) {
				currentIdx = skill_trees[i].indexOf(Skill.charAt(j));
				if ((beforeIdx > currentIdx && currentIdx != -1) || (beforeIdx == -1 && currentIdx != -1)) {
					answer--;
					break;
				}
				beforeIdx = currentIdx;
			}
		}
		
		return answer;
	}

}
