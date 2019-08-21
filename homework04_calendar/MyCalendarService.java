package homework04_calendar;

public class MyCalendarService {
	public String getEndDay(MyCalendar MyCalendar) {
		int month= MyCalendar.getMonth();
		String endDay = "";
		
		switch(month) {
		case 1 :case 3 :case 5 :case 7 :case 8 :case 10: case 12 : 
			endDay = "31일"; break;
		case 4 : case  6 : case  9 : case 11 :
			endDay = "30일";break;
		case 2 : endDay = "29일";break;
		default : System.out.println("잘못된 입력 입니다");
		}
		return endDay = String.format("%d월은 %s까지 입니다\n",month,endDay);
	}
	
	public String isLeapYear(MyCalendar mc) {
		String isLeapYear = "";
		
		int year = mc.getYear();
		
		if (year%4==0 && year%100!=0||year%400==0) {
			System.out.println("윤년 입니다");
		}else {
	}
		return isLeapYear =String.format("평년입니다");
}
}
