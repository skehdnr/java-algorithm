package study03;
import java.util.Scanner;
public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int flag = 0;
	
		while(true) {
			System.out.println("메뉴 : 0.종료 1.계산기 2.BMI");
			flag = scanner.nextInt();
			switch(flag) {
			case 0 : System.out.println("종료");return;
			case 1 : System.out.println("계산기");break;
			case 2 : System.out.println("BMI");break;
			}
		}
	}

}
