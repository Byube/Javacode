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
			int alpha = str.charAt(i); //alpha ���� ����, ������ �ѹ��ھ� �ֱ�
			arr[alpha-65] ++;		// �빮�� A�� ASCII code ���� 65��. �Է¹��� ���ڰ� a,A(toUpperCase �Լ��� ���� �빮�ڷ� ��ȯ)��� ġ�� 
		}							// 65 - 65 = 0 �̹Ƿ� ���� arr �迭�� 0��°���� a���� ���������� ������ ����. A ~ Z ����
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
