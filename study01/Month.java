package study01;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Month {
	
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(date);
		String temp = today.substring(5,7);
		int imonth = Integer.parseInt(temp);
//		int imonth = Integer.parseInt(today.substring(5,7));
		String eval = "";
		switch(imonth) {
		case 1 : eval = "1월";
		break;
		case 2 : eval = "2월";
		break;
		case 3 : eval = "3월";
		break;
		case 4 : eval = "4월";
		break;
		case 5 : eval = "5월";
		break;
		case 6 : eval = "6월";
		break;
		case 7 : eval = "7월";
		break;
		case 8 : eval = "8월";
		break;
		case 9 : eval = "9월";
		break;
		case 10 : eval = "10월";
		break;
		case 11 : eval = "11월";
		break;
		case 12 : eval = "12월";
		break;
		}
		System.out.println(eval);
	}
	
}