package homework04_grade;

public class GradeService {
	public String getTotal(Grade grade) {
		String result = "";
		int kor = grade.getKor();
		int math = grade.getMath();
		int eng = grade.getEng();
		int total=kor+math+eng;
		result = String.format("총점은 %d \n",total);
		return result;
	}
	
	public String getAvg(Grade grade) {
		String avg = "";
		int kor = grade.getKor();
		int math = grade.getMath();
		int eng = grade.getEng();
		int sum=kor+math+eng;
		int average = sum/3;
		
		return avg= String.format("점수의 평균은 :%s점 입니다.", average/3);
		
	}
}
