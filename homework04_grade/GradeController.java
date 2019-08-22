package homework04_grade;
import javax.swing.JOptionPane;

import homework04_calendar.MyCalendar;

public class GradeController {

	public static void main(String[] args) {
		Grade grade = null;
		GradeService gradeService = new GradeService();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.점수입력 2.총점 3.평균")) {
			case "0" : System.out.println("종료");return;
			case "1" : 
			grade = new Grade();
			String kor=(JOptionPane.showInputDialog("국어점수 입력"));
			grade.setKor(Integer.parseInt(kor));
			String math=(JOptionPane.showInputDialog("수학점수 입력"));
			grade.setMath(Integer.parseInt(math));
			String eng=(JOptionPane.showInputDialog("영어점수 입력"));
			grade.setEng(Integer.parseInt(eng));break;
			
			case "2" :
				JOptionPane.showMessageDialog(null, "점수총합\n"+gradeService.getTotal(grade));
			break;
			case "3" :
				JOptionPane.showMessageDialog(null, "점수평균\n" + gradeService.getAvg(grade));break;
			}
			}
		}
	}

		
		
		
		
		
	


