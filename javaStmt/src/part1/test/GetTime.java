package part1.test;

import java.util.Scanner;

public class GetTime {
	public static void main(String[] args) {
		int time = 5000; // ��
		int second = 0, minute = 0, hour = 0;
		
		second = time % 60; // 5000�ʸ� 60���� ���� �������� ��
		minute = (time / 60) % 60; // %�� ������ ���̰� /�� ���� �����Ѵ�.
		hour =(time / 60) / 60;
				
		/*
		 5000�ʸ� 60���� ���� ���� �ٽ� 60���� ���� �������� ��
		 �϶� �ð��� ���Ͻð� ��µǰԲ� �ϼ���.
		 */
		
		System.out.println(hour + "��");
		System.out.println(minute + "��");
		System.out.println(second + "��");
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("�ð��� ���ϰ� ���� �ʸ� �Է��ϼ���");
		int a = scanner.nextInt();
		
		int second2 = 0, minute2 = 0, hour2 = 0;
		second2 = a % 60; // 5000�ʸ� 60���� ���� �������� ��
		minute2 = (a / 60) % 60;
		hour2 =(a / 60) / 60;
		
		System.out.println(hour2 + "��");
		System.out.println(minute2 + "��");
		System.out.println(second2 + "��");
		
	}
}
