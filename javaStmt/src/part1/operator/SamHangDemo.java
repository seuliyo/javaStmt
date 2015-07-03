package part1.operator;

public class SamHangDemo {
	public static void main(String[] args) {
		int x = 1, y = 0, z = 0;
		boolean bool = false; // boolean 은 논리연산자, false는 0, true는 1
		z = bool ? x : y ;
		System.out.println("삼항연산자 결과 출력 : " + z);
		// bool이 true인 경우 : x 값인 1 출력
		// bool이 false인 경우 : y 값인 0 출력
	
		/*
		 Q. 정수형 타입 flag은 10입니다. 정수형 타입 flag2는 20입니다. 
		    주어진 식이 () ? "flag은 flag2보다 큽니다" : "flag은 flag2보다 작습니다."
		    일때 콘솔창에 참인 값이 출력되도록 구현해주세요.
		 */
		
		int flag = 10, flag2 = 20;
		boolean result = flag > flag2;
		String result2 = (result) ? "flag은 flag2보다 큽니다" : "flag은 flag2보다 작습니다.";
		/*
		 출력값(리턴값)이 정수형이면 결과값에 해당하는 변수 타입을 int 로 주고
		 출력값(리턴값)이 리터럴이면 결과값에 해당하는 변수 타입을 String 이라고 준다.
		 */
		
	}
}
