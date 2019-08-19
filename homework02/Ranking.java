package homework02;

import java.util.Scanner;

public class Ranking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	       double[] records = new double[3];
	       int[] rank = new int[3];
	       int[] score = new int[3];
	       String[] player = new String[] {"A","B","C"};
	       for(int i = 0; i < 3 ; i++) { //순위 배열을 모두 1등으로 초기화 시켜줍니다.
	          rank[i] = 1;
	          }
	       for(int i = 0; i <3 ; i++) { //점수 배열에 학생의 점수를 3번 입력받습니다.
	          System.out.println("기록을 입력해주세요.");
	          records[i] = scanner.nextDouble();
	          System.out.printf("%s의 기록 : %.1f\n",player[i],records[i]);
	       }
	       for(int i = 0; i < 3 ; i++) { 
	          //학생들 끼리의 점수를 비교해서 자신의 점수보다 크면 해당순위를 1씩 증가시켜 순위를 결정.
	          for(int j = 0 ; j < 3 ; j++) {
	             if(score[i]< score[j])
	                rank[i] = rank[i]+1;
	          }
	       }
	       for(int i = 0 ; i < 3 ; i++) { //순위 출력문입니다.
	          System.out.printf("%d등 : %s 선수기록 (%.1f)\n",i+1,player[i],records[i]);
	       }

	}

}
