package weekly_java;
/*
 * 작성자:김지민
 * 작성일:2022.07.16
 * 내용:continue문을 배우자
 */
public class Test53 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i ++) {
			if ( i == 5 ) {
				continue;
			}
			System.out.println(i);
		}
		
			System.out.println("End");
	}

}
