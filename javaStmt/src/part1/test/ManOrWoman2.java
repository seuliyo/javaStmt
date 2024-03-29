package part1.test;

import java.util.Scanner;

public class ManOrWoman2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요 (예) 123456-4123456");
		String ssn = ""; // int형 초기화는 0, String 초기화는 ""
		ssn = scanner.next();
		String msg = "";
		/*int 타입을 받을때는 nextInt()
		  String 타입을 받을 때는 next()를 선택하세요.*/
		
		
		char ch = ssn.charAt(7); // 적당한 인덱스 값을 0대신 대치하세요.
		/* 남자인지 여자인지를 판별하는 부분은 예문에서 -다음 숫자인 4에 해당합니다.
		   스트링 문자열의 순서값은 인덱스라고 하는데 0부터 시작합니다.
		   따라서 예문에서 인덱스 0값은 1이고 인덱스1값은 2입니다.
		 */
		switch (ch) {
		case '1': case '3': msg = "남자"; break;
		case '2': case '4': msg = "여자"; break;
		case '5': case '6': msg = "외국인"; break;
		default: msg = "잘못된 입력 값입니다."; break;
		}
		System.out.println(msg);
		// 2와4는 여자, 5와6은 외국인, 나머지값은 잘못된 입력값입니다. 라고 출력해주세요
	}

}
