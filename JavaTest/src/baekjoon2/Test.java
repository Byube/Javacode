package baekjoon2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			switch (s.nextInt()) {
			case 1:
				int N = s.nextInt();
		        int five = 0;
		        int three = 0;
		        
		        
		        while(N%5!=0&&N>=0){
		            N-=3;
		            three++;
		        }
		        if(N<0){
		            System.out.println(-1);
		        }
		        else{
		            five = N/5;
		            System.out.println(five+three);        
		        }

				break;
			case 2:
				return;
			default:
				break;
			}
			
		}
	}

}
