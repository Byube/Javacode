package Test5;

import java.util.HashMap;

public class Main {
	public Main() {
		String[] participant = {"����ȣ","������","���ž�","������","��ȣ��","����ȣ","����ȯ"};
		String[] completion = {"���ž�","������","��ȣ��","����ȣ","������","����ȣ"};		
		String nacoh = solution(participant,completion);
		System.out.println(nacoh);
	}
	
	public String solution(String[] participant, String[] completion) {
       /* String answer = "";
        String temp = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i = 0;
        while (i < completion.length) {
			if(!completion[i].equals(participant[i])){
				temp = participant[i];
				break;
			} else {
				i ++;
			}
		}
        if (temp.equals("")) {
        	answer = participant[completion.length + 1];
        } else {
        	answer = temp;
        }
        
        return answer;*/
		
		
		String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) 
        	hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) 
        	hm.put(player, hm.get(player) - 1);
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		new Main();		
	}
	
	
}
