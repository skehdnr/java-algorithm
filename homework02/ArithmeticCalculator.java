package homework02;
import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=계산할 연산을 선택헤 주세요=");
		System.out.println("1.+ 2.- 3.* 4./ 0.종료");
		int a =scanner.nextInt();
		String b = String.valueOf(a);
		switch (a) {
		case 0 : System.out.println("종료 되었습니다");return;
		}
		System.out.println("첫번째 숫자를 입력해 주세요");
		int num1 =scanner.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요");
		int num2 =scanner.nextInt();
		int eval = 0;
		int rest = num1%num2;
		switch(a) {
		case 1 : eval = num1+num2; System.out.printf("%d + %d = %d \n",num1,num2,eval);break;
		case 2 : eval = num1-num2; System.out.printf("%d - %d = %d \n",num1,num2,eval);break;
		case 3 : eval = num1*num2; System.out.printf("%d * %d = %d \n",num1,num2,eval);break;
		case 4 : eval = num1/num2; System.out.printf("%d / %d = %d [%d] \n",num1,num2,eval,rest);break;
		default : System.out.println("잘못입력 했습니다");
		}
	}

}
//To. 개발자님
//프로그램을 하나 개발해야 합니다.
//교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
//복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
//몫과 나머지값으로 출력하면 된답니다.
//출력결과물은 예를 들어
//5 + 5 = 10
//2 - 7 = -5
//이렇게 되고,
//10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
//그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.