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
			System.out.println("계산하고 싶은 초를 입력해 주세요");
			int second = scanner.nextInt();
			String result = student.TimeCalc(second); 
			System.out.println(result);
			break;
			
			case 2 : System.out.println("ArithmeticCalculator 입니다");
			System.out.println("=계산할 연산을 선택헤 주세요=");
			System.out.println("1.+ 2.- 3.* 4./ ");
			int a =scanner.nextInt();
			String b = String.valueOf(a);
			System.out.println("첫번째 숫자를 입력해 주세요");
			int num1 =scanner.nextInt();
			System.out.println("두번째 숫자를 입력해 주세요");
			int num2 =scanner.nextInt();
			result = student.ArithmeticCalculator(a, num1, num2);
			System.out.println(result);
			break;
			
			case 3 : System.out.println("BMI 입니다");
			System.out.println("이름을 입력해 주세요");
			String name = scanner.next();
			System.out.println("몸무게를 입력해 주세요");
			int weight = scanner.nextInt();
			System.out.println("키를 입력해 주세요");
			int height = scanner.nextInt();
			result = student.BMI(name, weight, height);
			System.out.println(result);
			break;
			
			case 4 : System.out.println("HowMuch 입니다");
			System.out.println("개당 얼마예요?");
			int price = scanner.nextInt();
			System.out.println("몇개 드릴까요?");
			int some = scanner.nextInt();
			result = student.HowMuch(price, some);
			System.out.println(result);
			break;
			
			case 5 : System.out.println("LeapYear 입니다");
			System.out.println("연도를 입력해 주세요");
			int year = scanner.nextInt();
			result = student.LeapYear(year);
			System.out.println(result);
			break;
			
			case 6 : System.out.println("ReportCard 입니다");
			System.out.println("이름을 입력해 주세요");
			name = scanner.next();
			String [] subject = {"국어","영어","수학"};
			System.out.printf("%s 점수를 입력해 주세요 \n",subject[0]);
			int kor = scanner.nextInt();
			System.out.printf("%s 점수를 입력해 주세요 \n",subject[1]);
			int math = scanner.nextInt();
			System.out.printf("%s 점수를 입력해 주세요 \n",subject[2]);
			int eng = scanner.nextInt();
			result =student.ReportCard(name, kor, math, eng);
			System.out.println(result);
			break;
			
			case 7 : System.out.println("Tax 입니다");
			System.out.println("이름을 입력해주세요");
			name = scanner.next();
			System.out.println("연봉을 입력해 주세요");
			int money = scanner.nextInt();
			System.out.println("현재 세율을 입력해 주세요");
			double tax = scanner.nextDouble();
			result = student.Tax(name, money, tax);
			System.out.println(result);
			break;
			
			case 8 : System.out.println("PassOrFail 입니다");
			System.out.println("이름을 입력해 주세요");
			name = scanner.next();
			String [] subject1 = {"국어","영어","수학"};
			System.out.printf("%s 점수를 입력해 주세요 \n",subject1[0]);
			int kor1 = scanner.nextInt();
			System.out.printf("%s 점수를 입력해 주세요 \n",subject1[1]);
			int math1 = scanner.nextInt();
			System.out.printf("%s 점수를 입력해 주세요 \n",subject1[2]);
			int eng1 = scanner.nextInt();
			result =student.ReportCard(name, kor1, math1, eng1);
			System.out.println(result);
			break;
			
			case 9 : System.out.println("MonthEndDay 입니다");
			System.out.println("현재 월을 입력해 주세요");
			int month = scanner.nextInt();
			result = student.MonthEndDay(month);
			System.out.println(result);
			break;
			
			case 10 : System.out.println("Join 입니다");
			System.out.println("===회원가입===");
			System.out.println("가입하실 ID 를 입력해 주세요");
			String id = scanner.next();
			System.out.println("비밀번호를 입력해 주세요");
			int pass = scanner.nextInt();
			System.out.println("이름을 입력해 주세요");
			name = scanner.next();
			System.out.println("생년월일 6자리를 입력해 주세요. ex)123456");
			int bir = scanner.nextInt();
			System.out.println("성인여부(성인 1. 미성년2.)");
			int adult= scanner.nextInt();
			System.out.println("키를 입력해 주세요");
			height = scanner.nextInt();
			System.out.println("몸무게를 입력해 주세요");
			weight = scanner.nextInt();
			System.out.println("혈액형을 입력해 주세요");
			String bt = scanner.next();
			result =student.Join(id, pass, name, bir, adult, height, weight, bt);
			System.out.println(result);
			;break;
			
			case 11 : System.out.println("Ranking 입니다");
			student.Ranking();break;
			
			case 12 : System.out.println("ScoreCalc 입니다");
			student.ScoreCalc(0);break;
			
			default : System.out.println("잘못된 입력 입니다");return;
			}
		}
	}

}
