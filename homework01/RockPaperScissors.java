package homework01;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("가위 바위 보 게임입니다");
		System.out.println("1.가위 2.바위 3.보 <<< 세가지 중에 하나를 선택해 주세요");
		
		String a = scanner.next();
		int b = random.nextInt(3)+1; 
		String rps = "";
		
		switch(a + b) {
		case "1" + 1 : rps = "컴퓨터는 가위 를 냈고, 나는 " + a + " 로 비겼습니다."; break;
		case "1" + 2 : rps = "컴퓨터는 바위 를 냈고, 나는 " + a + " 로 졌습니다."; break;
		case "1" + 3 : rps = "컴퓨터는 보 를 냈고, 나는 " + a + " 로 이겼습니다."; break;
		case "2" + 1 : rps = "컴퓨터는 가위 를 냈고, 나는 " + a + " 로 이겼습니다."; break;
		case "2" + 2 : rps = "컴퓨터는 바위 를 냈고, 나는 " + a + " 로 비겼습니다."; break;
		case "2" + 3 : rps = "컴퓨터는 보 를 냈고, 나는 " + a + " 로 졌습니다."; break;
		case "3" + 1 : rps = "컴퓨터는 가위 를 냈고, 나는 " + a + " 로 졌습니다."; break;
		case "3" + 2 : rps = "컴퓨터는 바위 를 냈고, 나는 " + a + " 로 이겼습니다."; break;
		case "3" + 3 : rps = "컴퓨터는 보 를 냈고, 나는 " + a + " 로 비겼습니다."; break;
		
		}
		System.out.println(rps);
		
	}

}