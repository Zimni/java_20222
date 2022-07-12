package weekly_java;
/*작성자:김지민
* 작성일:2022.07.10
* 내용: if문에 대해 배워보자
* if else 문은 둘 중에 하나를 반드시 실행해야한다.
* */


public class Test57 {

	public static void main(String[] args) {
		
		int a = 5;
		
		if(a<7){
			//조건이 참이면 실행되는 코드 부분
			System.out.println("a는 7보다 작습니다.");
			
		}
		else {
			
			System.out.println("a는 7보다 크거나 같습니다.");
		}
		System.out.println("종료");
	}

}
