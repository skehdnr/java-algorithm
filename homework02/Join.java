package homework02;

import java.util.Scanner;

public class Join {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===회원가입===");
		System.out.println("가입하실 ID 를 입력해 주세요");
		String id = scanner.next();
		System.out.println("비밀번호를 입력해 주세요");
		int pass = scanner.nextInt();
		System.out.println("이름을 입력해 주세요");
		String name = scanner.next();
		System.out.println("생년월일 6자리를 입력해 주세요. ex)123456");
		int bir = scanner.nextInt();
		System.out.println("성인여부(성인 1. 미성년2.)");
		String adult= scanner.next();
		System.out.println("키를 입력해 주세요");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력해 주세요");
		double weight = scanner.nextDouble();
		System.out.println("혈액형을 입력해 주세요");
		String bt = scanner.next();
		
		System.out.println("===회원 정보===");
		System.out.printf("아이디 : %s \n비민벌호 : %d \n이름 : %s \n생년월일 : %d \n성인여부 : %s \n키 : %.2f cm \n몸무게 : %.2f kg \n혈액형 : %s\n",id,pass,name,bir,adult,height,weight,bt);
		
	}
}
//to. 개발자님
//여기는 비트헬스 입니다.
//입력받을 정보는 아래와 같습니다.
//값을 입력받은 후에 다시 입력받은 값을 그대로 보여주는
//프로그램을 보여주세요
//
//=== 회원가입 ===
//아이디 : 
//비밀번호 : 
//이름 : 
//생년월일(예) 1980-01-01 : 
//성인여부(성인true,미성년false) : 
//키(소수점 첫째자리까지) :
//몸무게(소수점 첫째자리까지) : 
//혈액형(A) : 
//
//입력이 종료되면 ...아래처럼 보이게 해주세요
//
//=== 회원정보 ===
//아이디 : hong
//비밀번호 : 1234
//이름 : 홍길동
//생년월일(예) 1990-05-05 : 
//성인여부(성인true,미성년false) : 성인
//키(소수점 첫째자리까지) : 178.5 cm
//몸무게(소수점 첫째자리까지) : 75kg
//혈액형(A) : B형

