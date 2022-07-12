package weekly_java;

/*작성자:김지민
* 작성일:2022.07.10
* 내용: 삼항 연산자 A?B:C => A조건이 참이면 B, 거짓이면 C선택
*/

public class Test42 {

	public static void main(String[] args) {
		int a =10;
		int b = 0;
		
		b = ( a==1 )? 20 : 30;
		
		System.out.println("b=>"+b);
		
		b = ( a == 10 ) ? 20 : 30;
		
		System.out.println("b=>"+b);
	}

}
