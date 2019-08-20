package homework03;

import java.util.Scanner;

public class Student {
	Scanner scanner = new Scanner(System.in);
	public String TimeCalc(int second) {
		int h = second/3600;
		int m = second%3600/60;
		int s = second%3600%60;
			String result = "";
			return result=String.format("%d시간%d분 %d초 입니다",h,m,s);
	}
	public String ArithmeticCalculator(int a,int num1,int num2) {
		int sum = 1;
		String eval = "";
		int rest = num1%num2;
		switch(a) {
		case 1 : eval = num1+"+"+num2 +"="+sum*(num1+num2); break;
		case 2 : eval = num1+"-"+num2 +"="+sum*(num1-num2); break;
		case 3 : eval = num1+"*"+num2 +"="+sum*(num1*num2); break;
		case 4 : eval = num1+"/"+num2 +"="+sum*(num1/num2)+"["+rest+"]"; break;
		default : System.out.println("잘못입력 했습니다");
	}
		String result="";
		return result = String.format(eval);
	}
	public String BMI(String name,int weight,int height) {
		String eval ="";
		double bmi =  weight/((height*0.01)*(height*0.01));
		System.out.printf("%.2f \n",bmi);
		
		if(bmi>30.0) {eval="고도비만 ";			
		}else if (bmi>25.0) {eval="비만 ";
		}else if (bmi>23.0) {eval="과체중 ";
		}else if (bmi>18.5) {eval="정상 ";
		}else {eval="저체중";
		}
		String result="";
		return result= String.format("%s의bmi는%s 입니다\n",name,eval);
	}
	public String HowMuch(int price,int some) {
		int total = price*some;
		int dc = total / 10;
		System.out.printf("금액은 %d 입니다 \n " ,total);
		System.out.println("비싸요, 10% 깎아주세요. ");
		total = total - dc;
		String result ="";
		return result = String.format("총금액은 %d 이며 , %d 할인 되었습니다.",total,dc);
	}
	public String LeapYear(int year) {
			String eval="";
			if (year%4==0 && year%100!=0||year%400==0) {
				eval="윤년";
			}else {
				eval="평년";
	}	String result ="";
			return result=String.format("%s입니다",eval);
		}
		
	public String ReportCard(String name,int kor,int math,int eng) {
		int total = kor+math+eng;
		int average = total/3;
		String eval="";
		if (average>=90) {
			eval="장학생";
		}else if (average>=70) {
			eval="합격";
		}else {eval="불학격";
		} String result ="";
		return result = String.format("%s ||총점은 %d 이고, 평균은 %d 입니다. %s입니다. \n",name,total,average,eval);
	}
	
	public String Tax(String name,int money,Double tax) {
		Double value = money/tax;
		String result = "";
		return result= String.format("연봉 %d 만원을 받으시는 %s 님께서 납부할 세금은 %.2f 만원 입니다 \n",money,name,value);
		
	}
	public String PassOrFail(String name,int kor,int math,int eng) {
		int total = kor+math+eng;
		int average = total/3;
		String eval="";
		if (average>=90) {
			eval="장학생";
		}else if (average>=70) {
			eval="합격";
		}else {eval="불학격";
		} String result ="";
		return result = String.format("%s ||총점은 %d 이고, 평균은 %d 입니다. %s입니다. \n",name,total,average,eval);
	}
	public String MonthEndDay(int month) {
		String day ="";
		String result="";
		switch(month) {
		case 1 :case 3 :case 5 :case 7 :case 8 :case 10: case 12 : 
			day = "31일"; break;
		case 4 : case  6 : case  9 : case 11 :
			day = "30일";break;
		case 2 : day = "29일";break;
		default : System.out.println("잘못된 입력 입니다");
		}
		return result = String.format("%d월은 %s까지 입니다\n",month,day);
	}
	public String Join(String id,int pass,String name,int bir,int adult,double height,double weight,String bt) {
		String result="";
		System.out.println("===회원 정보===");
		return result=String.format("아이디 : %s \n비민벌호 : %d \n이름 : %s \n생년월일 : %d \n성인여부 : %s \n키 : %.2f cm \n몸무게 : %.2f kg \n혈액형 : %s\n",id,pass,name,bir,adult,height,weight,bt);
		 
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
