package part1.array;

public class IntArrayDemo {
	public static void main(String[] args) {
		int sum = 0;
		
		int[] arr; // �迭�� ����
		arr = new int[3]; // �迭�� ��ü ����. ����! �Ҵ��� �ƴմϴ�.
		int[] arr2 = new int[3]; // ���ٷ� ����� ��ü����
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		
		for(int i=0;i<3;i++){
			sum += arr2[i];
		}		
		System.out.println(sum);
		
		/*�迭�� �̿��ؼ� 11���� 20������ ���� ���ϼ���.
		  arr3 �迭�� �����Ͻð� ������ּ���.*/
		sum = 0;
		int[] arr3 = {11,12,13,14,15,16,17,18,19,20};
		/*int[] arr3 = new int[10];
		arr3[0] = 11;
		arr3[1] = 12;
		arr3[2] = 13;
		arr3[3] = 14;
		arr3[4] = 15;
		arr3[5] = 16;
		arr3[6] = 17;
		arr3[7] = 18;
		arr3[8] = 19;
		arr3[9] = 20;*/
		
		for (int i=0;i<10;i++){
			sum += arr3[i];
		}
		System.out.println(sum);
	}
}
