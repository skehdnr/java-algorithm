package homework01;

import java.util.Scanner;
public class GenderChecker2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("출생 정보를 나타냅니다");
		System.out.println("개인정보 활용 동의는 1번 , 동의하지 않으면 0번을 입력해 주세요");
		int pi = scanner.nextInt();
		
		switch(pi) {
		case 1 : System.out.println("주민번호를 입력해 주세요");break;
		case 0 : System.out.println("동의하지 않으므로 종료됩니다");
		}
		String num ="";
		num = scanner.next();
		int Input = Integer.parseInt(num.substring(7,8));
		String a = "";
		
		switch(Input) {
		case 9 : a = "1800 ~ 1899년에 태어난 남성"; break;
		case 0 : a = "1800 ~ 1899년에 태어난 여성"; break;
		case 1 : a = "1900 ~ 1999년에 태어난 남성"; break;
		case 2 : a = "1900 ~ 1999년에 태어난 여성"; break;
		case 3 : a = "2000 ~ 2099년에 태어난 남성"; break;
		case 4 : a = "2000 ~ 2099년에 태어난 여성"; break;
		case 5 : a = "1900 ~ 1999년에 태어난 외국인 남성"; break;
		case 6 : a = "1900 ~ 1999년에 태어난 외국인 여성"; break;
		case 7 : a = "2000 ~ 2099년에 태어난 외국인 남성"; break;
		case 8 : a = "2000 ~ 2099년에 태어난 외국인 여성"; break;
		default : a = "잘못입력했습니다";break;
		}
		System.out.println(a);
		}
	}
}
