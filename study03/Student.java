package study03;
import java.util.Scanner;

public class Student {
// 1.BMI 2.Ranking 3.HowMuch 4.ReporetCard
	public String getBmi(String name,Double weight,Double height) {
	
	String eval ="";
	double cm = height*0.01;
	double bmi = weight/((height*0.01)*(height*0.01));
	System.out.printf("%.2f \n",bmi);
	
	if(bmi>30.0) {eval="고도비만";			
	}else if (bmi>25.0) {eval="비만 ";
	}else if (bmi>23.0) {eval="과체중 ";
	}else if (bmi>18.5) {eval="정상 ";
	}else {eval="저체중";
	}String result = String.format("%s의bmi는%s,입니다\n",name,eval);
	return result;
	}
	
	public String getRanking(double[] records,String[] player) {
		 Scanner scanner = new Scanner(System.in);
		 int[] rank = new int[3];
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
				 if(records[i]< records[j])
					 rank[i] = rank[i]+1;
			 }
		 }
		 for(int i = 0 ; i < 3 ; i++) { 
			 System.out.printf("%d등 : %s 선수기록 (%.1f)\n",i+1,player[i],records[i]);
		 }
		return null;
	}
	
	public void getHowmuch() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("개당 얼마예요?");
		int price = scanner.nextInt();
		
		System.out.println("몇개 드릴까요?");
		int some = scanner.nextInt();
		
		int total = price*some;
		int dc = total / 10;
		
		System.out.printf("금액은 %d 입니다 \n " ,total);
		System.out.println("비싸요, 10% 깎아주세요. ");
		total = total - dc;
		System.out.printf("총금액은 %d 이며 , %d 할인 되었습니다.",total,dc);
	}
	
	public void getRepoetcard() {
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
