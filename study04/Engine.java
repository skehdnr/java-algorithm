package study04;
import java.util.Scanner;
public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		while(true) {
			int flag = 0;
			System.out.println("0.종료 1.BMI");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			case 1 : System.out.println("BMI");
			String name = scanner.next();
			double height = scanner.nextDouble();
			double weight = scanner.nextDouble();
			String result = student.getBmi(name,height,weight);
			System.out.println(result);
			
			case 2 : System.out.println("이름,주소,나이,은행잔고,신용도 를 입력해 주세요");
			name = scanner.next();
			String adr =scanner.next();
			int age = scanner.nextInt();
			int Balance = scanner.nextInt();
			double credit = scanner.nextDouble();
			result = student.getMoney(name,adr,age,Balance,credit);
				System.out.println(result);
			//이름,주소,나이,은행잔고,신용도
				//결과가 뭘 넣든간에 1억 대출
				break;
			}
			
		}
		
		
	}

}
