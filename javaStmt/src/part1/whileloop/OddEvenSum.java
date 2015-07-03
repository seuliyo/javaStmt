package part1.whileloop;

public class OddEvenSum {
	public static void main(String[] args) {
		int num = 1, sum = 0, oddSum = 0, evenSum = 0; // 지역변수는 초기화 필수
		while(num<=10){
			sum += num;
			num++;
		}
		System.out.println(sum);
		
		// for문으로 변경, sum과 num을 그대로 재사용 해 주세요.		
		sum = 0; // 다시 초기화 해주는 작업이 필요
		for(num=1;num<=10;num++){
			sum += num;
		}
		System.out.println(sum);
		
		// 홀수, 짝수의 합
		// 홀수의 합
		num = 1;
		while(num<=10){
			oddSum += num;
			num += 2;
		}
		System.out.println("홀수의 합 : " + oddSum);
		
		num = 2;
		while(num<=10){
			evenSum += num;
			num += 2;
		}
		System.out.println("짝수의 합 : " + evenSum);
		
		//for + if 문을 가지고 한 연산식으로 홀짝을 출력
		
		oddSum = 0;
		evenSum = 0;
		for(num=1;num<=10;num++){
			if(num%2 == 0){
				evenSum += num;				
			} 
			if(num%2 == 1){
				oddSum += num;
			}	
			
			/*
			  if(num%2 == 0){
				evenSum += num;				
			} else if {
				oddSum += num;
			}	
			 */
		}
		System.out.println("[1] 홀수의 합 : " + oddSum);
		System.out.println("[2] 짝수의 합 : " + evenSum);
	}
}