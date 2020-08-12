package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

//baekjoon 3052¹ø ¹®Á¦

public class Main7 {
	public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int task = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
      
        
        double[] point = new double[task];
        double max = -1.0;
        double sum = 0.0;
        int count = 0;
        while(st.hasMoreElements()) {
            double d = Double.parseDouble(st.nextToken());
            point[count++] = d;
            if(d > max) max = d;
        }
        
        for(int i = 0; i < task; i++) {
            sum += point[i] / max * 100.0;
        }
        br.close();
        System.out.print(sum / count);
		
		/*Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		double sum = 0.0f;
		double max = 0.0f;
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i < x; i++) {
			answer.add(s.nextInt());
			max = Collections.max(answer);
		}
		for (int i = 0; i < x; i++) {
			sum += answer.get(i) / max * 100;
		}
		System.out.printf("%2f",sum/x);*/
		
	}
}

