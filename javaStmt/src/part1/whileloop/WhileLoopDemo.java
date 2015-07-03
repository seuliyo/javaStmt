package part1.whileloop;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int count = 1; 
		/*
		 int count = 0;이라고 주는것은 count 변수를 0으로 초기화(initialize)한다고 한다.
		 그런데 정수형 타입인 int의 디폴트값인 0으로 주지않고 1로 주는 것을 count 변수를 1로 초기화한다고 지칭함.
		 */
		while(count < 11){ // count가 11보다 작은상태 일떄만
			System.out.println("[1] 1부터 10까지의 범위 안에 있는 수들은 " + count + "입니다.");
			count++;
			System.out.println(count);			
		}
		/*
		 초기값과 조건식(컨디션)과 출력문과의 상관관계
		 [1] 컨디션 + 연산식 + 출력문
		 	 시작값을 0부터 시작하고 컨디션의 리미트값은 범위값 미만으로 설정한다.
		 [2] 컨디션 + 출력문 + 연산식
		 	 시작값을 1부터 시작하고 컨디션의 리미트값은 범위값 보다 1 큰값 미만으로 설정한다.
		*/
	}
}
