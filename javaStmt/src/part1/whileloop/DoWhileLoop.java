package part1.whileloop;
/*
 do~while 문은 while문과 거의 일치하나 다른점은 처음 한번은 무조건 수행하고 나서 조건을 비교한다.
 - 형식
 do{
  문장;
  }while(조건);  
 */

public class DoWhileLoop {
	public static void main(String[] args) {
		int count = 1;
		//do{}while();
		do{
			System.out.print(count+"\t"); 
			// ln은 line의 약자로 라인개행 명령어
			// \t는 이스케이프 문자로 tap 키를 의미함
			count++;
		}while(count<11);
	}
}
