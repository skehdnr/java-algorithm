package study02;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] subject = {"국어","영어","수학","과학","사회"};
		int[] scores = new int [5];
		for (int i = 0; i<subject.length; i++) {
			System.out.printf("%s 점수를 입력하세요\n",subject[i]);
			scores[i] = scanner.nextInt();
		}
		for(int i=0; i < scores.length; i++) {
		System.out.printf("%s 점수%d \n",subject[i],scores[i]);
	}
	}
}
