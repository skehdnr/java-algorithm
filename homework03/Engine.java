package homework03;
import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		while(true) {
			System.out.println("원하는 항목의 숫자를 입력해 주세요");
			System.out.println("1.TimeCalc 2.ArithmeticCalculator 3.BMI 4.HowMuch "
					+ "5.LeapYear 6.ReportCard 7.Tax 8.PassOrFail 9.MonthEndDay 10.Join 11.Ranking 12.ScoreCalc 0.종료");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			
			case 1 : System.out.println("TimeCalc 입니다");
			student.TimeCalc(0);break;
			
			case 2 : System.out.println("ArithmeticCalculator 입니다");
			student.ArithmeticCalculator(0, 0, 0);break;
			
			case 3 : System.out.println("BMI 입니다");
			student.BMI("", 0, 0);break;
			
			case 4 : System.out.println("HowMuch 입니다");
			student.HowMuch(0, 0);break;
			
			case 5 : System.out.println("LeapYear 입니다");
			student.LeapYear(0);break;
			
			case 6 : System.out.println("ReportCard 입니다");
			student.ReportCard("", 0, 0, 0);break;
			
			case 7 : System.out.println("Tax 입니다");
			student.Tax("", 0, 0.0);break;
			
			case 8 : System.out.println("PassOrFail 입니다");
			student.PassOrFail("", 0, 0, 0);break;
			
			case 9 : System.out.println("MonthEndDay 입니다");
			student.MonthEndDay(0);break;
			
			case 10 : System.out.println("Join 입니다");
			student.Join("", 0, "", 0, 0, 0.0, 0.0, "");break;
			
			case 11 : System.out.println("Ranking 입니다");
			student.Ranking();break;
			
			case 12 : System.out.println("ScoreCalc 입니다");
			student.ScoreCalc(0);break;
			
			default : System.out.println("잘못된 입력 입니다");return;
			}
		}
	}

}
