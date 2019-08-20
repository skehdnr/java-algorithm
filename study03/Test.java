package study03;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double [] records = new double[3];
		int rank [] = new int[3];
		String[] player = new String[] {"A,B,C"};
		for (int i = 0; i<3; i++) {
			rank [i]=1;
		}
		for (int i=0; i<3;i++) {
			System.out.println("기록을 입력해 주세요");
			records[i] = scanner.nextDouble();
			System.out.printf("%s 선수의 기록은 %d \n",player[i],records[i]);
		}
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(records[i]>records[j]) {
					rank [i] = rank [i]+1;
				}
			}
		}
		for(int i = 0; i<3; i++) {
			System.out.printf("%d등: %s선수기록 (%1.f)\n",rank [i],player[i],records[i]);
		}
		
		
		
	}

}
/*To. 개발자님
저희는 비트올림픽 위원회입니다.
한번의 트랙에서 육상선수는 총 3명 입니다.
총 세명의 100m 기록을 입력받아서 
1, 2, 3 등을 가려야 합니다.

A 선수 기록 : 10.5초
B 선수 기록 : 10.8초
C 선수 기록 : 10.1초 
라고 입력받았다면

###### 성적 랭킹 #######

1등 : C 선수 기록 (10.1초)
2등 : A 선수 기록 (10.5초)
3등 : B 선수 기록 (10.8초)

라고 출력시켜주세요.*/