package part1.test;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int a=0, b=0, c=0;
		System.out.println("A�� ���� �Է��ϼ���");
		a = scanner.nextInt();// a ���� �Է¹޴� ����
		System.out.println("B�� ���� �Է��ϼ���");
		b = scanner.nextInt();// b ���� �Է¹޴� ����
		System.out.println("C�� ���� �Է��ϼ���");
		c = scanner.nextInt();// c ���� �Է¹޴� ����
		
		if(a>b && a>c){ // a�� b���� ũ�鼭 c���ٵ� ũ�� (������)
			System.out.println("���� ū ���� A ���� "+a+" �Դϴ�.");
		}else if(b>a && b>c){
			System.out.println("���� ū ���� B ���� "+b+" �Դϴ�.");
		}else {
			System.out.println("���� ū ���� C ���� "+c+" �Դϴ�.");
		}

	}

}
