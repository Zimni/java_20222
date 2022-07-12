package weekly_java;
/*작성자:김지민
* 작성일:2022.07.10
* 내용: 비교문(1)
* if문에 대해 배워보자
* if ..else if.. 문
* */
public class Test57_1 {

	public static void main(String[] args) {
		
		int a = 5;
		
		if( a < 10 ) {
			System.out.println("a는 10보다 작습니다.");
			
		}
		else if (a < 7 ) {
			System.out.println("a는 7보다 작습니다.");
		}
		else if( a < 3 ) {
			System.out.println("a는 3보다 작습니다");
		}
		else {
			System.out.println("모르겠습니다.");
		}
		System.out.println("종료");
		}

}
