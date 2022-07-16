package weekly_java;
/*
 * 작성자:김지민
 * 작성일:2022.07.16
 * 내용:break문을 배우자
 */
public class Test52 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if ( i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("End");
	}

}
