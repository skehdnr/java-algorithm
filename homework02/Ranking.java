package homework02;

import java.util.Scanner;

public class Ranking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("A선수 기록을 입력해 주세요\nB선수 기록을 입력해 주세요\nC선수 기록을 입력해 주세요\n");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		int ranking = 0;
		
		switch(ranking) {
		case a : System.out.printf("A선수 기록은 %.1f \n",a);
		case b : System.out.printf("B선수 기록은 %.1f \n",b);
		default : System.out.printf("C선수 기록은 %.1f \n",c); break;
		}
		System.out.printf("###### 성적 랭킹 ####### \n1등 :%s선수 기록 (%.2f)\n2등 :%s선수 기록 (%.2f)\n3등 :%s선수 기록 (%.2f)\n",a,b,c);
	}
}

//저희는 비트올림픽 위원회입니다.
//한번의 트랙에서 육상선수는 총 3명 입니다.
//총 세명의 100m 기록을 입력받아서 
//1, 2, 3 등을 가려야 합니다.
//A 선수 기록 : 10.5초
//B 선수 기록 : 10.8초
//C 선수 기록 : 10.1초 
//라고 입력받았다면
//###### 성적 랭킹 #######
//1등 : C 선수 기록 (10.1초)
//2등 : A 선수 기록 (10.5초)
//3등 : B 선수 기록 (10.8초)
//라고 출력시켜주세요.
