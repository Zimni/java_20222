package weekly_java;

/*작성자:김지민
* 작성일:2022.07.09
* 내용: 비트 연산자에 대해 배워보자
*/

public class Test37 {

	public static void main(String[] args) {
		int a =60; //0011 1100
		int b =13; //0000 1101
		int c = 0;
		
		c = a & b;
		System.out.println("a & b =>"+c);
		
		c= a | b;
		
		System.out.println("a | b =>"+c);
	}

}
