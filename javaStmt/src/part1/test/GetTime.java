package part1.test;

import java.util.Scanner;

public class GetTime {
	public static void main(String[] args) {
		int time = 5000; // 초
		int second = 0, minute = 0, hour = 0;
		
		second = time % 60; // 5000초를 60으로 나눈 나머지는 초
		minute = (time / 60) % 60; // %는 나머지 값이고 /는 몫을 리턴한다.
		hour =(time / 60) / 60;
				
		/*
		 5000초를 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		 일때 시간은 구하시고 출력되게끔 하세요.
		 */
		
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("시간을 구하고 싶은 초를 입력하세요");
		int a = scanner.nextInt();
		
		int second2 = 0, minute2 = 0, hour2 = 0;
		second2 = a % 60; // 5000초를 60으로 나눈 나머지는 초
		minute2 = (a / 60) % 60;
		hour2 =(a / 60) / 60;
		
		System.out.println(hour2 + "시");
		System.out.println(minute2 + "분");
		System.out.println(second2 + "초");
		
	}
}
