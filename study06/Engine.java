package study06;
import javax.swing.JOptionPane;

public class Engine {
	
	public static void main(String[] args) {
		Member member = null;
		Service service = new Service();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.Join 2.마이페이지 3.아이디찾기 4.BMI 5.ReportCard 6.Tax")) {
			case "0" : System.out.println("종료");return;
			case "1" : 
			member = new Member();
			member.setId(JOptionPane.showInputDialog("ID입력"));
			member.setPass(JOptionPane.showInputDialog("비번입력"));
			member.setName(JOptionPane.showInputDialog("이름입력"));
			member.setSsn(JOptionPane.showInputDialog("주민번호입력"));
			String heigth=JOptionPane.showInputDialog("키 입력");
            member.setHeight(Double.parseDouble(heigth));
            String weigth=JOptionPane.showInputDialog("몸무게 입력");
            member.setWeight(Double.parseDouble(heigth));
			member.setBt(JOptionPane.showInputDialog("혈액형 입력"));
			String kor=(JOptionPane.showInputDialog("국어점수 입력"));
			member.setKor(Integer.parseInt(kor));
			String eng=(JOptionPane.showInputDialog("영어점수 입력"));
			member.setEng(Integer.parseInt(eng));
			//System.out.println("수학점수");
			//member.setMath(scanner.nextInt());
			//System.out.println("연봉 입력 해 주세요");
			//member.setYearmoney(scanner.nextInt());
			//System.out.println("세율을 입력해 주세요");
			//member.setTax(scanner.nextDouble());
			break;
			case "2" :
			JOptionPane.showMessageDialog(null, "2.마이페이지\n"+member.toString());
			break;
//			case "3" : 
//				System.out.println("이름과 주민번호 입력 하면 아이디 알려줌");
//				String searchName = scanner.next();
//				String searchId = scanner.next();
//				if(searchName.equals("a") &&
//						searchId.equals("a")) {
//					System.out.printf("찾는 아이디 : %s \n"
//							+ "주민번호: %s \n",member.getId(), member.getSsn());
//				}else {
//					System.out.println("찾는 아이디가 없습니다");
//				} break;
			case "4" : 
				System.out.println("BMI 구하기");
				System.out.println(service.getBmi(member));
				break;
			case "5" :
				System.out.println("ReportCard");
				System.out.println(service.getReportCard(member));
				break;
			case "6" :
				System.out.println("Tax");
				System.out.println(service.getTax(member));
				break;
			default : System.out.println("잘못입력");
			break;
			}
		}
	}

} 
