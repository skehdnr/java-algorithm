package study05;
import java.util.Scanner;
import javax.swing.JOptionPane;




public class Engine {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		
		while(true) {
			System.out.println("0.종료 1.Join 2.정보보기 3.아이디찾기 4.BMI 5.ReportCard 6.Tax");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			case 1 : 
			member = new Member();
			System.out.println("===회원가입===");
			System.out.println("가입하실 ID 를 입력해 주세요");
			member.setId(scanner.next());
			System.out.println("비밀번호를 입력해 주세요");
			member.setPass(scanner.next());
			System.out.println("이름을 입력해 주세요");
			member.setName(scanner.next());
			System.out.println("주민번호");
			member.setSsn(scanner.next());
			System.out.println("키를 입력해 주세요");
			member.setHeight(scanner.nextDouble());
			System.out.println("몸무게를 입력해 주세요");
			member.setWeight(scanner.nextDouble());
			System.out.println("혈액형을 입력해 주세요");
			member.setBt(scanner.next());
			System.out.println("국어점수");
			member.setKor(scanner.nextInt());
			System.out.println("영어점수");
			member.setEng(scanner.nextInt());
			System.out.println("수학점수");
			member.setMath(scanner.nextInt());
			System.out.println("연봉 입력 해 주세요");
			member.setYearmoney(scanner.nextInt());
			System.out.println("세율을 입력해 주세요");
			member.setTax(scanner.nextDouble());
			break;
			case 2 :
				System.out.println(member.toString());
			break;
			case 3 : 
				System.out.println("이름과 주민번호 입력 하면 아이디 알려줌");
				String searchName = scanner.next();
				String searchId = scanner.next();
				if(searchName.equals("a") &&
						searchId.equals("a")) {
					System.out.printf("찾는 아이디 : %s \n"
							+ "주민번호: %s \n",member.getId(), member.getSsn());
				}else {
					System.out.println("찾는 아이디가 없습니다");
				} break;
			case 4 : 
				System.out.println("BMI 구하기");
				System.out.println(service.getBmi(member));
				break;
			case 5 :
				System.out.println("ReportCard");
				System.out.println(service.getReportCard(member));
				break;
			case 6 :
				System.out.println("Tax");
				System.out.println(service.getTax(member));
				break;
			default : System.out.println("잘못입력");
			break;
			}
		}
	}

} 
