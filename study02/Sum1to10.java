package study02;

public class Sum1to10 {

	public static void main(String[] args) {
	
//		 1+2+3+4+5 = 로 나오게 표현
		int sum=0;
		String eval ="";
		
		for(int i = 1; i<=10; i++) {
			sum += i;
			if(i==10) {
				eval += i+" = ";
			}else {
				eval += i+" + ";
			}
		}
		System.out.print(eval+sum);
	}
}

