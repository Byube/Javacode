package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*int[] N = new int[10];
		int count = 0;
		int[] nacoh = new int[42];
		for (int i = 0; i < N.length; i++) {
			N[i] = s.nextInt();
		}
		s.close();
		for (int i = 0; i < N.length; i++) {
			nacoh[N[i]%42]++;
			
		}		
		for (int i = 0; i < nacoh.length; i++) {
			//System.out.println(i + " : " + nacoh[i]);
			if(nacoh[i] == 1) {
				count++;
			}
		}		
		System.out.println(count);*/
		int count = 1;
        int[] remain = new int[10];
        for(int i=0;i<10;i++) {
            int num = s.nextInt();
            remain[i] = num%42;
        }
        Arrays.sort(remain);
        for(int i=0; i<9; i++) {
            if(remain[i]!=remain[i+1]) {
                count++;
            }
        }
        
        System.out.println(count);
        
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = a % 42;
			System.out.println(b+":"+list.contains(b));
			if (!list.contains(b)) {
				list.add(b);
			}
		}
		System.out.println(list.size());*/

	}
}
