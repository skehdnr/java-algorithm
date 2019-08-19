package homework02;

import java.util.Scanner;

public class Ranking {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 double[] records = new double[3];
		 int[] rank = new int[3];
		 String[] player = new String[] {"A","B","C"};
		 for(int i = 0; i < 3 ; i++) { 
			 rank[i] = 1;
			 }
		 for(int i = 0; i <3 ; i++) { 
			 System.out.println("기록을 입력해주세요.");
			 records[i] = scanner.nextDouble();
			 System.out.printf("%s의 기록 : %.1f\n",player[i],records[i]);
		 }
		 for(int i = 0; i < 3 ; i++) { 
			 for(int j = 0 ; j < 3 ; j++) {
				 if(records[i]< records[j])
					 rank[i] = rank[i]+1;
			 }
		 }
		 for(int i = 0 ; i < 3 ; i++) { 
			 System.out.printf("%d등 : %s 선수기록 (%.1f)\n",i+1,player[i],records[i]);
		 }
	}

}