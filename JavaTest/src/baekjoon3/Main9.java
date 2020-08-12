package baekjoon3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main9 {
	
	public static void main(String[] args) throws IOException{
		  Scanner sc =new Scanner(System.in);
		  StringBuilder sb = new StringBuilder();
          int temp=3;            
          while(temp!=0) {
              int a=sc.nextInt();
              int b=sc.nextInt();
              int c=sc.nextInt();
              int[] answer= {a,b,c};
              Arrays.sort(answer);
              temp=a;
              if(temp==0) {
            	  break;
              } else {
                      if(Math.pow(answer[2], 2)==Math.pow(answer[0], 2)+Math.pow(answer[1], 2)) {
                    	  sb.append("right").append("\n");
                      }
                      else {
                    	  sb.append("wrong").append("\n");
                      }
              }
          }
          System.out.println(sb);
	}
}
