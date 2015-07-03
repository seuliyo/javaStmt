package part1.test;

import java.util.Scanner;

public class GugudanScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요");
		int dan = scanner.nextInt(); // 0대신 스캐너 입력값 할당		
		if(dan>1){
			for(int i=1;i<10;i++){				
				System.out.println(dan + " * " + i + " = " + dan*i );
			}
		}else{
			System.out.println("1이상의 정수값만 입력하세요");
		}

	}
}