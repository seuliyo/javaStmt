package part1.array;
/*
 1���� 10������ ��
 */
public class ForLoopAssign {
	public static void main(String[] args) {
		int[] intArr = new int[10];
		int sum = 0;
		for(int i=0;i<intArr.length;i++){
			/*
			 �Ʒ��κ� 0��� ���� �־�� for�� �ε��� ���� Ȱ���� ���� ���� ���� �� �ֳ���?
			 */
			intArr[i] = i+1; // ���������� �ּ�ȭ �Ϸ��� ����� ��ȯ
			sum += intArr[i];
		}
		System.out.println(sum);
	}
}
/*
 intArr[0] = 1;
 intArr[1] = 2;
 ...
 intArr[9] = 10;
 
 */
