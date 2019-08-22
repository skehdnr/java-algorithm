package study07;

public class MemberService {
	public String getBmi(MemberBean member) {
	String name =member.getName();
	String result = "";
	String eval = "";
	double height = member.getHeight();
	double weight = member.getWeight();
	double bmi =  weight/((height*0.01)*(height*0.01));
	if(bmi>30.0) {eval="고도비만";			
	}else if (bmi>25.0) {eval="비만 ";
	}else if (bmi>23.0) {eval="과체중 ";
	}else if (bmi>18.5) {eval="정상 ";
	}else {eval="저체중";
	}
	return result= String.format("%s 의bmi는%s,입니다\n",name,eval);
	}
}
