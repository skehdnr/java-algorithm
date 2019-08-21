package study06;

public class Service {
	public String getBmi(Member member) {
		String name = member.getName();
		String result = "";
		String eval="";
		double height = member.getHeight();
		double weight = member.getWeight();
		double bmi =  weight/((height*0.01)*(height*0.01));
		System.out.printf("%.2f \n",bmi);
		if(bmi>30.0) {System.out.println("고도비만 입니다");			
		}else if (bmi>25.0) {eval="비만 ";
		}else if (bmi>23.0) {eval="과체중 ";
		}else if (bmi>18.5) {eval="정상 ";
		}else {eval="저체중";
		}System.out.printf("%s의bmi는%s,입니다\n",name,eval);
		return result;
	}
	public String getReportCard(Member member) {
		String result = "";
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		
		int total = kor+math+eng;
		int average = total/3;
		String name = member.getName();
		if (average>=90) {
			System.out.printf("%s ||총점은 %d점 이고, 평균은 %d 입니다. 장학생 입니다. \n",name,total,average);
		}else if (average>=70) {
			System.out.printf("%s ||총점은 %d 이고, 평균은 %d 입니다. 합격 입니다.\n",name,total,average);
		}else {System.out.printf("%s ||총점은 %d 이고, 평균은 %d 입니다. 불합격 입니다. \n",name,total,average);
		}
		return result;
	}
	public String getTax(Member member) {
		String result = "";
		int money = member.getYearmoney();
		Double tax = member.getTax();
		Double value = money*tax*0.01;
		String name = member.getName();
		System.out.printf("연봉 %d 만원을 받으시는 %s 님께서 납부할 세금은 %.2f 만원 입니다 \n",money,name,value);
		return result;
}
}
