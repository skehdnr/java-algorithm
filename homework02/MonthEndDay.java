package homework02;

import java.util.Scanner;

public class MonthEndDay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("현재 월을 입력해 주세요");
		int month = scanner.nextInt();
		String day ="";
		switch(month) {
		case 1 :case 3 :case 5 :case 7 :case 8 :case 10: case 12 : 
			day = "31일"; break;
		case 4 : case  6 : case  9 : case 11 :
			day = "30일";break;
		case 2 : day = "29일";break;
		default : System.out.println("잘못된 입력 입니다");
		}
		System.out.printf("%d월은 %s까지 입니다\n",month,day);
	}

}
//To. 개발자님
//월을 입력하면 해당 월이 몇일까지인지
//알려주는 프로그램을 작성해 주세요.
//단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
//출력문장 : "??월은 **일 까지 입니다."
// 
