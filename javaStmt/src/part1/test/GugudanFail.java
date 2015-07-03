package part1.test;
/*
 @ Date : 2015.06.15
 @ Author : 
 @ Story : 2중 for문 연습문제. 구구단의 원시타입. 하지만 완성형은 아닌 상태
 */
public class GugudanFail {
	public static void main(String[] args) {
		for(int i=2;i<10;i++){
			for(int j=1;j<10;j++){
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}

	}
}