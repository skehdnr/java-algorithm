package step1;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Month {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String now = sdf.format(date);
		int month = Integer.parseInt(now.substring(6,7)); 
		String today ="";
		
		switch(month) {
		case 1 : today="1월"; break;
		case 2 : today="2월"; break;
		case 3 : today="3월"; break;
		case 4 : today="4월"; break;
		case 5 : today="5월"; break;
		case 6 : today="6월"; break;
		case 7 : today="7월"; break;
		case 8 : today="8월"; break;
		case 9 : today="9월"; break;
		case 10 : today="10월"; break;
		case 11 : today="11월"; break;
		case 12 : today="12월"; break;
		default : today="잘못된 입력";break;
		}
		System.out.println(today+"입니다");
	}
	
}