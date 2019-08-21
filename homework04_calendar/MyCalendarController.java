package homework04_calendar;
import javax.swing.JOptionPane;
public class MyCalendarController {

	public static void main(String[] args) {
		MyCalendar myCalendar = null;
		
		MyCalendarService mcs= new MyCalendarService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.월체크 2.윤년,평년확인")) {
			case "0" : System.out.println("종료");return;
			case "1" : 
			myCalendar = new MyCalendar();
			String month =(JOptionPane.showInputDialog("현재 월 입력"));
			myCalendar.setMonth(Integer.parseInt(month));
			JOptionPane.showMessageDialog(null,mcs.getEndDay(myCalendar));
			
			case "2" :
			myCalendar = new MyCalendar();
			String year = (JOptionPane.showInputDialog("현재 년도를 입력해 주세요"));
			myCalendar.setYear(Integer.parseInt(year));
			JOptionPane.showMessageDialog(null, mcs.isLeapYear(myCalendar));
			}
		}
		
	}

}
