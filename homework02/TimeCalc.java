package homework02;
import java.util.Scanner;
public class TimeCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산하고 싶은 초를 입력해 주세요");
		int second = scanner.nextInt();
		/*int h = second/3600;
		int m = second/60;
		int s = second%60;
*/
		/*int s = second;
		int m = s/60;
		int h = m/60;
			if (second==s) {
				System.out.println("초 입니다");
			}else /*System.out.println(a+b+"초입니다");*/
		int h = second/3600;
		int m = second%3600/60;
		int s = second%3600%60;
			System.out.printf("%d시간%d분 %d초 입니다",h,m,s);
		}
		
}
//To.개발자님께
//초단위로 알려주는 시험이 있는데
//이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
//혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
//그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.