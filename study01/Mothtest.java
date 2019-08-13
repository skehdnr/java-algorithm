package study01;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Mothtest {
	public static void main(String[] args) {
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
	String now = sdf.format(date);
	int a = Integer.parseInt(now.substring(6,7));
	String b = "";
	
	switch(a) {
	case 1 : b = "1월"; break;
	case 2 : b = "2월"; break;
	case 3 : b = "3월"; break;
	case 4 : b = "4월"; break;
	case 5 : b = "5월"; break;
	case 6 : b = "6월"; break;
	case 7 : b = "7월"; break;
	case 8 : b = "8월"; break;
	case 9 : b = "9월"; break;
	case 10 : b = "10월"; break;
	case 11 : b = "11월"; break;
	case 12 : b = "12월"; break;
	default : b = "x"; break;
	}
	System.out.println(b);
	}
	
}
