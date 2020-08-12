package baekjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str = str.toUpperCase();
		int[] arr = new int[26];
		int max = 0;
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			int alpha = str.charAt(i); //alpha 변수 선언, 변수에 한문자씩 넣기
			arr[alpha-65] ++;		// 대문자 A의 ASCII code 값은 65임. 입력받은 문자가 a,A(toUpperCase 함수로 인해 대문자로 변환)라고 치면 
		}							// 65 - 65 = 0 이므로 위의 arr 배열의 0번째에는 a부터 순차적으로 개수를 샌다. A ~ Z 까지
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i + 65;
			}
			else if (max == arr[i]){
				index = '?';
			}
		}
		System.out.println((char)index);
	}
}
