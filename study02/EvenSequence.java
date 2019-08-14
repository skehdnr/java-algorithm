package study02;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;
public class EvenSequence {
public static void main(String[] args) {
	String sequence = "";
	int series = 0;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("처음값");
	int start = scanner.nextInt();
	System.out.println("마지막값");
	int end = scanner.nextInt();
	
	for(int i =start; i<=end; i++) {
		if(i == 0 ) {
			int end2 = 0;
		}else {
			sequence+= i+"=";
		}
	}
	System.out.println(sequence+series);
}
}
