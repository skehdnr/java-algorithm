package study02;

public class Sum1to5 {

	public static void main(String[] args) {
	
//		 1+2+3+4+5 = 로 나오게 표현
		String eval = "";
		int sum=0;
		for(int i = 1; i<=5; i++) {
			eval += (i==5) ? i+" = " : i+" + "; // 3항연산자
		sum+=i;
		}
		System.out.print(eval+sum);
	}
}
