package study01;
import java.util.Scanner;
public class print5Times {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		while(true) {
			System.out.println("진행1 , 스톱 0");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0 : 
				System.out.println("시스템 종료");
				return;
			case 1 : 
				System.out.println("시스템 진행");
				break;
			}
			System.out.println("안녕");
			flag++;
		}
	}

}
