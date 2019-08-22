package study07;
import javax.swing.JOptionPane;


public class MemberController {
	public static void main(String[] args) {
		MemberBean member = null;
		MemberService service = new MemberService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.Join 2.마이페이지 3.BMI")) {
			case "0" : System.out.println("종료");return;
			case "1" : 
			member = new MemberBean();
			member.setId(JOptionPane.showInputDialog("ID입력"));
			member.setPass(JOptionPane.showInputDialog("비번입력"));
			member.setName(JOptionPane.showInputDialog("이름입력"));
			member.setSsn(JOptionPane.showInputDialog("주민번호입력"));
			String heigth=JOptionPane.showInputDialog("키 입력");
            member.setHeight(Double.parseDouble(heigth));
            String weigth=JOptionPane.showInputDialog("몸무게 입력");
            member.setWeight(Double.parseDouble(weigth));
			member.setBt(JOptionPane.showInputDialog("혈액형 입력"));
			break;
			
			case "2" :
			JOptionPane.showMessageDialog(null, "마이페이지 : "+member.toString()); break;
			
			case "3" :
			JOptionPane.showMessageDialog(null, "BMI : "+service.getBmi(member));break;
		
		
	}
}
	}
}
