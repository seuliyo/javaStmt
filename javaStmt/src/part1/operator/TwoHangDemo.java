package part1.operator;
/*
*Demo.java �̸��� ���̸�
Demo�� ���üҽ��� ���ϴ� ���̻��̹Ƿ� 
���üҽ��� ������ Ŭ������� �ν��ϸ� �ȴ�.
*/
public class TwoHangDemo {
	public static void main(String[] args) {
		int x = 20;
		int y = 7;
		int add, sub, gob, mok, nmg; // Ÿ���� ���� ������ ������ ���� �׷����� �����ϴ�.
		add = x + y;
		sub = x - y;
		gob = x * y;
		mok = x / y;
		nmg = x % y;
		
		// ������ȣ�� *, �������� �� ���ϴ� ��ȣ�� / , �������� ������ ���ϴ� ��ȣ�� %
		// ���� ��ȣ�� - , ���� ��ȣ�� + �� ��
		// ���� ������ gob, �������� �� ������ mok, ������ ������ nmg, ������ sub
		// �� ����Ͻÿ�.
		
		System.out.println("x + y = " + add);
		System.out.println("x - y = " + sub);
		System.out.println("x * y = " + gob);
		System.out.println("x / y = " + mok);
		System.out.println("x % y = " + nmg);

	
	}
}
