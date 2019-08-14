package study02;
import java.util.Scanner;
public class IntArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] subject = {"국어","영어","수학","과학","사회"};
		System.out.printf("%s점수를 입력하세요\n",subject[0]);
		int kor = scanner.nextInt();
		System.out.printf("%s점수를 입력하세요\n",subject[1]);
		int eng = scanner.nextInt();
		System.out.printf("%s점수를 입력하세요\n",subject[2]);
		int math = scanner.nextInt();
		System.out.printf("%s점수를 입력하세요\n",subject[3]);
		int science = scanner.nextInt();
		System.out.printf("%s점수를 입력하세요\n",subject[4]);
		int society = scanner.nextInt();
		
		int[] scores = {kor,eng,math,science,society};
		System.out.printf("%s 점수%d \n",subject[0],scores[0]);
		System.out.printf("%s 점수%d \n",subject[1],scores[1]);
		System.out.printf("%s 점수%d \n",subject[2],scores[2]);
		System.out.printf("%s 점수%d \n",subject[3],scores[3]);
		System.out.printf("%s 점수%d \n",subject[4],scores[4]);
	}

}
