package homework02;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요");
		String name = scanner.next();
		
		String [] subject = {"국어","영어","수학"};
		System.out.printf("%s 점수를 입력해 주세요 \n",subject[0]);
		int kor = scanner.nextInt();
		System.out.printf("%s 점수를 입력해 주세요 \n",subject[1]);
		int math = scanner.nextInt();
		System.out.printf("%s 점수를 입력해 주세요 \n",subject[2]);
		int eng = scanner.nextInt();
		
		int total = kor+math+eng;
		int average = total/3;
		
		if (average>=90) {
			System.out.printf("%s ||총점은 %d점 이고, 평균은 %d 입니다. 장학생 입니다. \n",name,total,average);
		}else if (average>=70) {
			System.out.printf("%s ||총점은 %d 이고, 평균은 %d 입니다. 합격 입니다.\n",name,total,average);
		}else {System.out.printf("%s ||총점은 %d 이고, 평균은 %d 입니다. 불합격 입니다. \n",name,total,average);
		}
	}

}

//To. 개발자님
//성적표 프로그램 을 하나 개발해야 합니다.
//교수는 학생과 국어, 영어, 수학점수만 입력하면
//총점, 평균, 합격여부가 출력되는 프로그램 입니다.
//오더는 다음과 같이 화면에 출력하라고 합니다.
//
//학생           국어        영어        수학        총점        평균        합격여부
//=======================================================
//홍길동     90       90      90     270      90       (장학생)
//
//합격여부는 다음과 같다고 합니다.
//평균이 90점 이상이면 장학생
//0점 이상 90점미만 이면 합격
//70미만이면 불합격이라고 하네요.
//단) 평균에서 소수점이하는 절삭입니다.

