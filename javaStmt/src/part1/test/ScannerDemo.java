package part1.test;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		/*
		 ��ĳ�� Ŭ������ ��ü�� scanner�� �����Ͽ���.
		 */
		Scanner scanner = new Scanner(System.in); 
		System.out.println("���ڸ� �Է��� �ּ���");
		int a = scanner.nextInt();
		//System.out.println(a);
		
		
		//for������ �Էµ� ����ŭ�� ���� ���ϴ� ������� �����ϼ���.
		int sum = 0;		// for ���� ������� ����ϴ� ������ �ٱ��ʿ� ���� �� �ʱ�ȭ
		for (int t=0;t<=a;t++){
			sum += t;
		}
		System.out.println("1���� "+a+"������ ���� : " + sum); //��°��� for���� �� �������� ���;� �ϹǷ� �ٱ���
		
	}
}
