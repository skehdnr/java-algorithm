package homework02;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요");
		String name = scanner.next();
		System.out.println("몸무게를 입력해 주세요");
		int weight = scanner.nextInt();
		System.out.println("키를 입력해 주세요");
		int height = scanner.nextInt();
		
		double bmi =  weight/((height*0.01)*(height*0.01));
		System.out.println(Math.round(bmi*100)/100.0);
		
		if(bmi>30.0) {System.out.println("고도비만 입니다");			
		}else if (bmi>25.0) {System.out.println("비만 입니다");
		}else if (bmi>23.0) {System.out.println("과체중 입니다");
		}else if (bmi>18.5) {System.out.println("정상 입니다");
		}else {System.out.println("저체중 입니다");}
	}

}
//To. 개발자님
//사람의 이름을 입력하고, 몸무게 , 키를 입력하면
//해당 사람의 상태가 비만인지 저체중인지 알려주는 BMI 지수 측정하는 프로그램을 만들어 주세요.
//BMI 구하는 공식은 아래와 같아요. 더 궁금하면 여기를 클릭하세요.
//      BMI = x KG / (y M * y M)
//
//Example for 175 cm height and 70 kg weight:
//BMI = 70 / (1.75 * 1.75) = 22.86
//
//(bmi > 30.0) 고도비만
//(bmi > 25.0) 비만
//(bmi > 23.0) 과체중
//(bmi > 18.5) 정상
//저체중
//      이랍니다.
