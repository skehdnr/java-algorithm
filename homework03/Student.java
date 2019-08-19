package homework03;

import java.util.Scanner;

public class Student {
	Scanner scanner = new Scanner(System.in);
	public String TimeCalc(int second) {
		System.out.println("계산하고 싶은 초를 입력해 주세요");
		second = scanner.nextInt();
		int h = second/3600;
		int m = second%3600/60;
		int s = second%3600%60;
			System.out.printf("%d시간%d분 %d초 입니다",h,m,s);
			return null;
	}
	public String ArithmeticCalculator(int a,int num1,int num2) {
		System.out.println("=계산할 연산을 선택헤 주세요=");
		System.out.println("1.+ 2.- 3.* 4./ ");
		a =scanner.nextInt();
		String b = String.valueOf(a);
		System.out.println("첫번째 숫자를 입력해 주세요");
		num1 =scanner.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요");
		num2 =scanner.nextInt();
		int eval = 0;
		int rest = num1%num2;
		switch(a) {
		case 1 : eval = num1+num2; System.out.printf("%d + %d = %d \n",num1,num2,eval);break;
		case 2 : eval = num1-num2; System.out.printf("%d - %d = %d \n",num1,num2,eval);break;
		case 3 : eval = num1*num2; System.out.printf("%d * %d = %d \n",num1,num2,eval);break;
		case 4 : eval = num1/num2; System.out.printf("%d / %d = %d [%d] \n",num1,num2,eval,rest);break;
		default : System.out.println("잘못입력 했습니다");
	}return null;
	}
	public String BMI(String name,int weight,int height) {
		System.out.println("이름을 입력해 주세요");
		name = scanner.next();
		System.out.println("몸무게를 입력해 주세요");
		weight = scanner.nextInt();
		System.out.println("키를 입력해 주세요");
		height = scanner.nextInt();
		String eval ="";
		
		double bmi =  weight/((height*0.01)*(height*0.01));
		System.out.printf("%.2f \n",bmi);
		
		if(bmi>30.0) {eval="고도비만 ";			
		}else if (bmi>25.0) {eval="비만 ";
		}else if (bmi>23.0) {eval="과체중 ";
		}else if (bmi>18.5) {eval="정상 ";
		}else {eval="저체중";
		}System.out.printf("%s의bmi는%s 입니다\n",name,eval);
		return null;
	}
	public String HowMuch(int price,int some) {
		System.out.println("개당 얼마예요?");
		price = scanner.nextInt();
		System.out.println("몇개 드릴까요?");
		some = scanner.nextInt();
		int total = price*some;
		int dc = total / 10;
		System.out.printf("금액은 %d 입니다 \n " ,total);
		System.out.println("비싸요, 10% 깎아주세요. ");
		total = total - dc;
		System.out.printf("총금액은 %d 이며 , %d 할인 되었습니다.",total,dc);
		return null;
	}
	public String LeapYear(int year) {
			System.out.println("연도를 입력해 주세요");
			year = scanner.nextInt();
			if (year%4==0 && year%100!=0||year%400==0) {
				System.out.println("윤년 입니다");
			}else {
				System.out.println("평년 입니다");
	}
			return null;
		}
		
	public String ReportCard(String name,int kor,int math,int eng) {
		System.out.println("이름을 입력해 주세요");
		name = scanner.next();
		String [] subject = {"국어","영어","수학"};
		System.out.printf("%s 점수를 입력해 주세요 \n",subject[0]);
		kor = scanner.nextInt();
		System.out.printf("%s 점수를 입력해 주세요 \n",subject[1]);
		math = scanner.nextInt();
		System.out.printf("%s 점수를 입력해 주세요 \n",subject[2]);
		eng = scanner.nextInt();
		
		int total = kor+math+eng;
		int average = total/3;
		
		if (average>=90) {
			System.out.printf("%s ||총점은 %d점 이고, 평균은 %d 입니다. 장학생 입니다. \n",name,total,average);
		}else if (average>=70) {
			System.out.printf("%s ||총점은 %d 이고, 평균은 %d 입니다. 합격 입니다.\n",name,total,average);
		}else {System.out.printf("%s ||총점은 %d 이고, 평균은 %d 입니다. 불합격 입니다. \n",name,total,average);
		}
		return null;
	}
	public String Tax(String name,int money,Double tax) {
		System.out.println("이름을 입력해주세요");
		name = scanner.next();
		System.out.println("연봉을 입력해 주세요");
		money = scanner.nextInt();
		System.out.println("현재 세율을 입력해 주세요");
		tax = scanner.nextDouble();

		Double value = money/tax;

		System.out.printf("연봉 %d 만원을 받으시는 %s 님께서 납부할 세금은 %.2f 만원 입니다 \n",money,name,value);
		return null;
	}
	public String PassOrFail(String name,int kor,int math,int eng) {
		System.out.println("이름을 입력해 주세요");
		name = scanner.next();
		
		String [] subject = {"국어","영어","수학"};
		System.out.printf("%s 점수를 입력해 주세요 \n",subject[0]);
		kor = scanner.nextInt();
		System.out.printf("%s 점수를 입력해 주세요 \n",subject[1]);
		math = scanner.nextInt();
		System.out.printf("%s 점수를 입력해 주세요 \n",subject[2]);
		eng = scanner.nextInt();
		
		int total = kor+math+eng;
		int average = total/3;
		
		if (average>=90) {
			System.out.printf("%s ||총점은 %d점 이고, 평균은 %d 입니다. 장학생 입니다. \n",name,total,average);
		}else if (average>=70) {
			System.out.printf("%s ||총점은 %d 이고, 평균은 %d 입니다. 합격 입니다.\n",name,total,average);
		}else {System.out.printf("%s ||총점은 %d 이고, 평균은 %d 입니다. 불합격 입니다. \n",name,total,average);
		}
		return null;
	}
	public String MonthEndDay(int month) {
		System.out.println("현재 월을 입력해 주세요");
		month = scanner.nextInt();
		String day ="";
		switch(month) {
		case 1 :case 3 :case 5 :case 7 :case 8 :case 10: case 12 : 
			day = "31일"; break;
		case 4 : case  6 : case  9 : case 11 :
			day = "30일";break;
		case 2 : day = "29일";break;
		default : System.out.println("잘못된 입력 입니다");
		}
		System.out.printf("%d월은 %s까지 입니다\n",month,day);
		return null;
	}
	public String Join(String id,int pass,String name,int bir,int adult,double height,double weight,String bt) {
		System.out.println("===회원가입===");
		System.out.println("가입하실 ID 를 입력해 주세요");
		id = scanner.next();
		System.out.println("비밀번호를 입력해 주세요");
		pass = scanner.nextInt();
		System.out.println("이름을 입력해 주세요");
		name = scanner.next();
		System.out.println("생년월일 6자리를 입력해 주세요. ex)123456");
		bir = scanner.nextInt();
		System.out.println("성인여부(성인 1. 미성년2.)");
		adult= scanner.nextInt();
		System.out.println("키를 입력해 주세요");
		height = scanner.nextDouble();
		System.out.println("몸무게를 입력해 주세요");
		weight = scanner.nextDouble();
		System.out.println("혈액형을 입력해 주세요");
		bt = scanner.next();
		System.out.println("===회원 정보===");
		System.out.printf("아이디 : %s \n비민벌호 : %d \n이름 : %s \n생년월일 : %d \n성인여부 : %s \n키 : %.2f cm \n몸무게 : %.2f kg \n혈액형 : %s\n",id,pass,name,bir,adult,height,weight,bt);
		return null;
	}
	public void Ranking() {
		 double[] records = new double[3];
		 int[] rank = new int[3];
		 String[] player = new String[] {"A","B","C"};
		 for(int i = 0; i < 3 ; i++) { 
			 rank[i] = 1;
			 }
		 for(int i = 0; i <3 ; i++) { 
			 System.out.println("기록을 입력해주세요.");
			 records[i] = scanner.nextDouble();
			 System.out.printf("%s의 기록 : %.1f\n",player[i],records[i]);
		 }
		 for(int i = 0; i < 3 ; i++) { 
			 for(int j = 0 ; j < 3 ; j++) {
				 if(records[i]> records[j])
					 rank[i] = rank[i]+1;
			 }
		 }
		 for(int i = 0 ; i < 3 ; i++) { 
			 System.out.printf("%d등 : %s 선수기록 (%.1f)\n",rank[i],player[i],records[i]);
		 }
	}
	public String ScoreCalc(int input ) {
		int sum = 0;
		int average = 0;
		String sequence ="";
		
		while(true) {
			System.out.println("더하려는 숫자를 입력해 주세요 (종료는 -1)");
			input = scanner.nextInt();
			if (input==-1) { 
				sequence += "="; break;
			}else if (sum==0) {
				sequence += input; 
			}else {
				sequence +=  "+" + input;
			}average++;
			sum+=input;
			}System.out.printf("종료\n 현재까지의 누적값은 %s %d 이고, 평균은 %d 입니다.\n",sequence,sum,sum/average);
			return null;
	}
	
	
	
}
